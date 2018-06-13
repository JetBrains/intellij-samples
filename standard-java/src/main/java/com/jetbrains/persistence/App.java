package com.jetbrains.persistence;

import com.jetbrains.persistence.models.Customer;
import org.hibernate.ejb.HibernatePersistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import java.util.HashMap;
import java.util.List;

public class App {
    public static final String SELECT_QUERY =
            "from Customer where email = :email";

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        String email = "andrey.cheptsov@jetbrains.com";
        PersistenceProvider persistenceProvider = new HibernatePersistence();
        EntityManagerFactory entityManagerFactory = persistenceProvider.
                createEntityManagerFactory("NewPersistenceUnit", new HashMap());
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Customer> customers = entityManager.createQuery(SELECT_QUERY,
                Customer.class).setParameter("email", email).getResultList();
        System.out.println(customers);
        entityManager.close();
    }
}
