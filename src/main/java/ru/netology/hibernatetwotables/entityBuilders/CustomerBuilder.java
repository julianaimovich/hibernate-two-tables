package ru.netology.hibernatetwotables.entityBuilders;

import ru.netology.hibernatetwotables.entities.Customers;

import java.util.ArrayList;
import java.util.List;

public class CustomerBuilder {

    public static Customers getCustomerAlexey() {
        return Customers.builder()
                .name("Alexey")
                .surname("Petrov")
                .age(18)
                .phoneNumber("88005553535")
                .build();
    }

    public static Customers getCustomerPetr() {
        return Customers.builder()
                .name("Petr")
                .surname("Ivanov")
                .age(20)
                .phoneNumber("1234567")
                .build();
    }

    public static Customers getCustomerMiron() {
        return Customers.builder()
                .name("Miron")
                .surname("Fyodorov")
                .age(39)
                .phoneNumber("666666")
                .build();
    }

    public static Customers getCustomerOlga() {
        return Customers.builder()
                .name("Olga")
                .surname("Kirillova")
                .age(45)
                .phoneNumber("651651981")
                .build();
    }

    public static List<Customers> getListOfCustomers() {
        List<Customers> customers = new ArrayList<Customers>();
        customers.add(getCustomerAlexey());
        customers.add(getCustomerPetr());
        customers.add(getCustomerMiron());
        customers.add(getCustomerOlga());
        return customers;
    }
}