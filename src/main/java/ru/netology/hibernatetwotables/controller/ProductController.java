package ru.netology.hibernatetwotables.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatetwotables.services.OrderService;

import java.util.List;

@RestController
public class ProductController {
    OrderService service;

    public ProductController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductsNames(String name) {
        return service.getProductsNames(name);
    }
}