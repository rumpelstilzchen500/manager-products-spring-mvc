package com.rumpel.common.controller;

import com.rumpel.common.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.sql.SQLException;

@Controller
@RequestMapping("/products")
public class ProductsController {

    @RequestMapping(method = RequestMethod.GET)
    public String printProducts(Model model) throws SQLException {
        ProductServiceImpl productService = new ProductServiceImpl();
        model.addAttribute("SelectAll", productService.getAll());

        return "products";
    }
}
