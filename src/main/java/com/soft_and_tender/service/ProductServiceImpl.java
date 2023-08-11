package com.soft_and_tender.service;

import com.soft_and_tender.dao.ProductDAO;
import com.soft_and_tender.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Products> getAllProducts() {
        return productDAO.getAllProducts();
    }

    @Override
    public void saveProduct(Products product) {
        productDAO.saveProduct(product);
    }

    @Override
    public Products getProduct(int id) {
        return productDAO.getProduct(id);
    }

    @Override
    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }
}
