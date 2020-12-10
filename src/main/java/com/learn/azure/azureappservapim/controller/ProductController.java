package com.learn.azure.azureappservapim.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/ekart")
public class ProductController {

    private final Logger logger = LoggerFactory.getLogger(ProductController.class);


    @GetMapping("/products")
    public List<String> getProducts() {
        try {
            logger.info("Started Product Controller");
            return Arrays.asList("Computer", "Keyboard");
        } catch (Exception e) {
            logger.error("Exception when do getProducts: {}", e);
            return Arrays.asList("Product not found");
        }
    }

    @GetMapping("/users")
    public List<String> getUsers() {
        try {
            logger.info("Started User Controller");
            return Arrays.asList("John", "Williams");
        } catch (Exception e) {
            logger.error("Exception when do getUsers: {}", e);
            return Arrays.asList("Users not found");
        }
    }

}
