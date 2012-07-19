package models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
public class Product {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String title;

    @javax.persistence.Column(name = "title")
    @Basic
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String description;

    @javax.persistence.Column(name = "description")
    @Basic
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String notes;

    @javax.persistence.Column(name = "notes")
    @Basic
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    private BigDecimal price;

    @javax.persistence.Column(name = "price")
    @Basic
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        if (notes != null ? !notes.equals(product.notes) : product.notes != null) return false;
        if (price != null ? !price.equals(product.price) : product.price != null) return false;
        if (title != null ? !title.equals(product.title) : product.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    private Collection<OrderItem> orderItemsById;

    @OneToMany(mappedBy = "productByProductId")
    public Collection<OrderItem> getOrderItemsById() {
        return orderItemsById;
    }

    public void setOrderItemsById(Collection<OrderItem> orderItemsById) {
        this.orderItemsById = orderItemsById;
    }

    private Vendor vendorByVendorId;

    @ManyToOne
    public
    @JoinColumn(name = "vendor_id", referencedColumnName = "id")
    Vendor getVendorByVendorId() {
        return vendorByVendorId;
    }

    public void setVendorByVendorId(Vendor vendorByVendorId) {
        this.vendorByVendorId = vendorByVendorId;
    }
}
