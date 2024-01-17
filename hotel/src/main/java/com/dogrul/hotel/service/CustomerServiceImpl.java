package com.dogrul.hotel.service;

import com.dogrul.hotel.dao.CustomerDAO;
import com.dogrul.hotel.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;
    @Transactional
    @Override
    public List<Customer> get() {
        return customerDAO.get();
    }

    @Transactional
    @Override
    public Customer get(int id) {
        return null;
    }

    @Override
    public void save(Customer customer) {
        customerDAO.save(customer);
    }

    @Transactional
    @Override
    public void create(Customer customer) {

    }

    @Transactional
    @Override
    public void delete(int id) {

    }
}
