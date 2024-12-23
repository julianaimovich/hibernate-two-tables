package ru.netology.hibernatetwotables.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.hibernatetwotables.entities.Customers;
import ru.netology.hibernatetwotables.repositories.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customers> createCustomersList(List<Customers> customersList) {
        return customerRepository.addListOfCustomers(customersList);
    }
}