package com.soft_and_tender.dao;

import com.soft_and_tender.entity.Product_categories;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Product_categories> getAllCategories() {
        Session session = sessionFactory.getCurrentSession();
        List<Product_categories> allCategories = session.createQuery("from Product_categories", Product_categories.class).getResultList();
        return allCategories;
    }
}


