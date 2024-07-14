package com.wslprojects.springjpa.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wslprojects.springjpa.entities.pk.OrdenItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;


@Entity
@Table(name = "tb_order_item")
public class OrderItem {

    @EmbeddedId
    private OrdenItemPK id = new OrdenItemPK();

    private Integer quantity;
    private Double  price;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product,  Integer quantity, Double price) {

        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public  Order getOrder(){
        return id.getOrder();
    }

    public Order setOrder(Order order){
        return id.setOrder(order);
    }

    public  Product getProduct(){
        return id.getProduct();
    }

    public Product setProduct(Product product){
        return id.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
