package com.rumpel.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/products")
public class ProductsController {

    @RequestMapping(method = RequestMethod.GET)
    public String printProducts(Model model){

        return "products";
    }
}
