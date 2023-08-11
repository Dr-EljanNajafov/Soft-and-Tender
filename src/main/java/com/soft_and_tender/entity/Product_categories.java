package com.soft_and_tender.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "products", name = "product_categories")
public class Product_categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int id;

    @Column(name = "category_name")
    private String category_name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private List<Products> productsList;

    public Product_categories() {
    }

    public Product_categories(String category_name) {
        this.category_name = category_name;
    }

    public void addProductToCategories(Products products) {
        if (productsList == null) {
            productsList = new ArrayList<>();
        }

        productsList.add(products);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    @Override
    public String toString() {
        return "product_categories{" +
                "id=" + id +
                ", category_name='" + category_name + '\'' +
                '}';
    }
}

