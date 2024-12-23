package ru.netology.hibernatetwotables.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.hibernatetwotables.entities.Orders;
import ru.netology.hibernatetwotables.repositories.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Orders> createOrdersList(List<Orders> ordersList) {
        return orderRepository.addListOfOrders(ordersList);
    }

    public List<String> getProductsNames(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty");
        }
        return orderRepository.getProductsNames(name);
    }
}