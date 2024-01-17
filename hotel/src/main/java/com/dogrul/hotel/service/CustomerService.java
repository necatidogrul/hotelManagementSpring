package com.dogrul.hotel.service;

import com.dogrul.hotel.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> get();

    Customer get(int id);
    void save(Customer customer);

    void create(Customer customer);
    void delete(int id);
}
