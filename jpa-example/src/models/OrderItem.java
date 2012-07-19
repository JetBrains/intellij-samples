package models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@javax.persistence.Table(name = "order_item", schema = "", catalog = "crm")
@Entity
public class OrderItem {
    private int quantity;

    @javax.persistence.Column(name = "quantity")
    @Basic
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderItem = (OrderItem) o;

        if (id != orderItem.id) return false;
        if (quantity != orderItem.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = quantity;
        result = 31 * result + id;
        return result;
    }

    private Order orderByOrderId;

    @ManyToOne
    public
    @javax.persistence.JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    Order getOrderByOrderId() {
        return orderByOrderId;
    }

    public void setOrderByOrderId(Order orderByOrderId) {
        this.orderByOrderId = orderByOrderId;
    }

    private Product productByProductId;

    @ManyToOne
    public
    @javax.persistence.JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    Product getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(Product productByProductId) {
        this.productByProductId = productByProductId;
    }
}
