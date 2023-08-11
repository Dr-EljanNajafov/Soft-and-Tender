package com.soft_and_tender.dao;

import com.soft_and_tender.entity.Products;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Products> getAllProducts() {
        Session session = sessionFactory.getCurrentSession();

        List<Products> allProducts = session.createQuery("from Products", Products.class).getResultList();

        return allProducts;
    }

    @Override
    public void saveProduct(Products product) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
    }

    @Override
    public Products getProduct(int id) {
        Session session = sessionFactory.getCurrentSession();

        Products products = session.get(Products.class, id);
        return products;
    }

    @Override
    public void deleteProduct(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Products> query = session.createQuery("delete from Products where id =:productId");
        query.setParameter("productId", id);
        query.executeUpdate();
    }
}
