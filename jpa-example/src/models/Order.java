package models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Order {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Timestamp createdDate;

    @javax.persistence.Column(name = "created_date")
    @Basic
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    private String deliveryAddress;

    @javax.persistence.Column(name = "delivery_address")
    @Basic
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    private String deliveryNotes;

    @javax.persistence.Column(name = "delivery_notes")
    @Basic
    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    public void setDeliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes;
    }

    private Timestamp deliveredDate;

    @javax.persistence.Column(name = "delivered_date")
    @Basic
    public Timestamp getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(Timestamp deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (createdDate != null ? !createdDate.equals(order.createdDate) : order.createdDate != null) return false;
        if (deliveredDate != null ? !deliveredDate.equals(order.deliveredDate) : order.deliveredDate != null)
            return false;
        if (deliveryAddress != null ? !deliveryAddress.equals(order.deliveryAddress) : order.deliveryAddress != null)
            return false;
        if (deliveryNotes != null ? !deliveryNotes.equals(order.deliveryNotes) : order.deliveryNotes != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (deliveryAddress != null ? deliveryAddress.hashCode() : 0);
        result = 31 * result + (deliveryNotes != null ? deliveryNotes.hashCode() : 0);
        result = 31 * result + (deliveredDate != null ? deliveredDate.hashCode() : 0);
        return result;
    }

    private Customer customerByCustomerId;

    @ManyToOne
    public
    @javax.persistence.JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)
    Customer getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(Customer customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    private Collection<OrderItem> orderItemsById;

    @OneToMany(mappedBy = "orderByOrderId")
    public Collection<OrderItem> getOrderItemsById() {
        return orderItemsById;
    }

    public void setOrderItemsById(Collection<OrderItem> orderItemsById) {
        this.orderItemsById = orderItemsById;
    }
}
