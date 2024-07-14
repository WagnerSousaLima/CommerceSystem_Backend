package com.wslprojects.springjpa.entities.pk;

import com.wslprojects.springjpa.entities.Order;
import com.wslprojects.springjpa.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;


@Embeddable
public class OrdenItemPK {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public Order setOrder(Order order) {
        this.order = order;
        return order;
    }

    public Product getProduct() {
        return product;
    }

    public Product setProduct(Product product) {
        this.product = product;
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdenItemPK that = (OrdenItemPK) o;
        return Objects.equals(order, that.order) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }
}
