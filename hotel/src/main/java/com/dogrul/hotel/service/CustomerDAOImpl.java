package com.dogrul.hotel.service;

import com.dogrul.hotel.dao.CustomerDAO;
import com.dogrul.hotel.entity.Customer;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Customer> get() {
       Session currentSession =entityManager.unwrap(Session.class);
        Query<Customer> query = currentSession.createQuery("from Customer",Customer.class);
        List<Customer> list =query.getResultList();
        return list;
    }

    @Override
    public Customer get(int id) {
        return null;
    }

    @Override
    public void save(Customer customer) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.save(customer);
    }

    @Override
    public void create(Customer customer) {

    }

    @Override
    public void delete(int id) {

    }
}
