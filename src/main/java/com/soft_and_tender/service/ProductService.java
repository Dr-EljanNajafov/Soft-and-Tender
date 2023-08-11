package com.soft_and_tender.service;

import com.soft_and_tender.entity.Products;
import java.util.List;

public interface ProductService {
    public List<Products> getAllProducts();
    public void saveProduct(Products product);
    public  Products getProduct(int id);
    public void deleteProduct(int id);
}
