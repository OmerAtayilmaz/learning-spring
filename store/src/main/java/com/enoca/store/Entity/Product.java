package com.enoca.store.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="products")
public class Product {
    @Id
    @Column(name="product_id") //db'de denk gelecek column nameleri belirliyoruz
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    @Column(name="product_name")
    private String product_name;
    @Column(name="category_id")
    private Long category_id;
    @Column(name="price")
    private float price;
    @Column(name="quantity")
    private int quantity;

    public Product() {
    }

    public Product(Long product_id, String product_name, Long category_id, float price, int quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.category_id = category_id;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
