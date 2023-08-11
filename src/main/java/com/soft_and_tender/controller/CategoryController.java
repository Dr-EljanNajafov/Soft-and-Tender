package com.soft_and_tender.controller;

import com.soft_and_tender.entity.Product_categories;
import com.soft_and_tender.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.transaction.Transactional;
import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    @Transactional
    public String showAllProducts(Model model) {

        List<Product_categories> allCategories = categoryService.getAllCategories();
        model.addAttribute("allCategory", allCategories);

        return "all-products";
    }
}

