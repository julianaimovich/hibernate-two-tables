package ru.netology.hibernatetwotables.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.hibernatetwotables.entities.Orders;

import java.util.List;

@Repository
public class OrderRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Orders addOrder(Orders orders) {
        entityManager.persist(orders);
        return entityManager.find(Orders.class, orders.getId());
    }

    @Transactional
    public List<Orders> addListOfOrders(List<Orders> ordersList) {
        ordersList.forEach(this::addOrder);
        return entityManager.createQuery("select o from Orders o").getResultList();
    }

    public List<String> getProductsNames(String name) {
        String jpqlQuery = "SELECT o.productName FROM Orders o LEFT JOIN Customers c ON o.customers.id = c.id " +
                "WHERE LOWER(c.name) = :name";
        Query query = entityManager.createQuery(jpqlQuery, String.class);
        query.setParameter("name", name);
        return query.getResultList();
    }
}