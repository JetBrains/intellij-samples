CREATE TABLE customer
(
    id int PRIMARY KEY NOT NULL,
    first_name varchar(45) NOT NULL,
    middle_name varchar(45),
    last_name varchar(45) NOT NULL,
    phone varchar(45),
    email varchar(45),
    notes text
);
CREATE TABLE vendor
(
  id int PRIMARY KEY NOT NULL,
  name varchar(45) NOT NULL,
  phone varchar(45) NOT NULL,
  email varchar(45) NOT NULL,
  notes varchar(45) NOT NULL
);
CREATE TABLE product
(
  id int PRIMARY KEY NOT NULL,
  title varchar(45) NOT NULL,
  vendor_id int,
  description varchar(45),
  notes varchar(45),
  price decimal(10,3),
  FOREIGN KEY ( vendor_id ) REFERENCES vendor ( id )
);
CREATE TABLE `order`
(
    id int PRIMARY KEY NOT NULL,
    customer_id int NOT NULL,
    created_date datetime NOT NULL,
    delivery_address varchar(255) NOT NULL,
    delivery_notes varchar(255) NOT NULL,
    delivered_date datetime,
    FOREIGN KEY ( customer_id ) REFERENCES customer ( id )
);
CREATE TABLE order_item
(
    order_id int NOT NULL,
    product_id int NOT NULL,
    quantity int NOT NULL,
    id int PRIMARY KEY NOT NULL,
    FOREIGN KEY ( order_id ) REFERENCES `order` ( id ),
    FOREIGN KEY ( product_id ) REFERENCES product ( id )
);