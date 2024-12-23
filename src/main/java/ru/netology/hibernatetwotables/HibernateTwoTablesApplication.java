package ru.netology.hibernatetwotables;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.hibernatetwotables.entities.Customers;
import ru.netology.hibernatetwotables.entityBuilders.CustomerBuilder;
import ru.netology.hibernatetwotables.entityBuilders.OrderBuilder;
import ru.netology.hibernatetwotables.services.CustomerService;
import ru.netology.hibernatetwotables.services.OrderService;

import java.util.List;

@SpringBootApplication
public class HibernateTwoTablesApplication implements CommandLineRunner {
    @Autowired
    CustomerService customerService;
    @Autowired
    OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(HibernateTwoTablesApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) {
        List<Customers> customersList = customerService.createCustomersList(CustomerBuilder.getListOfCustomers());
        orderService.createOrdersList(OrderBuilder.getListOfOrders(customersList));
    }
}