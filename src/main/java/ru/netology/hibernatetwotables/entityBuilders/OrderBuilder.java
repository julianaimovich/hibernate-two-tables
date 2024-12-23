package ru.netology.hibernatetwotables.entityBuilders;

import ru.netology.hibernatetwotables.entities.Customers;
import ru.netology.hibernatetwotables.entities.Orders;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {

    private static Orders getOrderMilk(Customers customers) {
        return Orders.builder()
                .date(Date.valueOf("2023-05-13"))
                .customers(customers)
                .productName("Milk")
                .amount(33)
                .build();
    }

    private static Orders getOrderCoffee(Customers customers) {
        return Orders.builder()
                .date(Date.valueOf("2024-05-08"))
                .customers(customers)
                .productName("Coffee")
                .amount(20)
                .build();
    }

    private static Orders getOrderPepper(Customers customers) {
        return Orders.builder()
                .date(Date.valueOf("2024-05-16"))
                .customers(customers)
                .productName("Pepper")
                .amount(3)
                .build();
    }

    private static Orders getOrderBread(Customers customers) {
        return Orders.builder()
                .date(Date.valueOf("2024-09-13"))
                .customers(customers)
                .productName("Bread")
                .amount(666)
                .build();
    }

    public static List<Orders> getListOfOrders(List<Customers> customersList) {
        List<Orders> ordersList = new ArrayList<>();
        ordersList.add(getOrderMilk(customersList.get(0)));
        ordersList.add(getOrderCoffee(customersList.get(1)));
        ordersList.add(getOrderPepper(customersList.get(2)));
        ordersList.add(getOrderBread(customersList.get(3)));
        return ordersList;
    }
}