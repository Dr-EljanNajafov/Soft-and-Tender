package com.soft_and_tender.entity;

import javax.persistence.*;

@Entity
@Table(schema = "products", name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "description")
    private String product_description;

    @Column(name = "stock_quantity")
    private int stock_quantity;

    @Column(name = "price")
    private double product_price;


    public Products() {
    }

    public Products(String product_name, String product_description, int stock_quantity, double product_price) {
        this.product_name = product_name;
        this.product_description = product_description;
        this.stock_quantity = stock_quantity;
        this.product_price = product_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", product_name='" + product_name + '\'' +
                ", product_description='" + product_description + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", product_price=" + product_price +
                '}';
    }
}

