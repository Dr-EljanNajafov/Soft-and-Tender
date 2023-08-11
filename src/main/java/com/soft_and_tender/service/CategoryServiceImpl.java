package com.soft_and_tender.service;

import com.soft_and_tender.dao.CategoryDAO;
import com.soft_and_tender.entity.Product_categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public List<Product_categories> getAllCategories() {
        return categoryDAO.getAllCategories();
    }
}
