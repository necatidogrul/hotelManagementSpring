package com.dogrul.hotel.dao;

import com.dogrul.hotel.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> get();

    Customer get(int id);

    void save(Customer customer);

    void create(Customer customer);
    void delete(int id);
}
