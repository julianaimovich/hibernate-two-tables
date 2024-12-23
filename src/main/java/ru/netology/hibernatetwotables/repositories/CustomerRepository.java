package ru.netology.hibernatetwotables.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.hibernatetwotables.entities.Customers;

import java.util.List;

@Repository
public class CustomerRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Customers addCustomer(Customers customers) {
        entityManager.persist(customers);
        return entityManager.find(Customers.class, customers.getId());
    }

    @Transactional
    public List<Customers> addListOfCustomers(List<Customers> customersList) {
        customersList.forEach(this::addCustomer);
        return entityManager.createQuery("select c from Customers c").getResultList();
    }
}