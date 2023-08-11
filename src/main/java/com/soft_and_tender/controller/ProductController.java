package com.soft_and_tender.controller;

import com.soft_and_tender.entity.Products;
import com.soft_and_tender.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.transaction.Transactional;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/developer_info")
    @Transactional
    public String showAllProducts(Model model) {
        List<Products> allProducts = productService.getAllProducts();
        model.addAttribute("allProduct", allProducts);
        return "view-for-developers";
    }

    @RequestMapping("/addNewProduct")
    public String addNewProduct(Model model) {
        Products products = new Products();
        model.addAttribute("products", products);
        return "product-info";
    }

    @RequestMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("products") Products products) {
        productService.saveProduct(products);
        return "redirect:/developer_info";
    }

    @RequestMapping("/updateInfo")
    public String updateProduct(@RequestParam("productId") int id, Model model) {
        Products products = productService.getProduct(id);
        model.addAttribute("products", products);
        return "product-info";
    }

    @RequestMapping("/deleteProduct")
    public String deleteProduct(@RequestParam("productId") int id) {
        productService.deleteProduct(id);
        return "redirect:/developer_info";
    }


}
