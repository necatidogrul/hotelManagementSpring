package com.dogrul.hotel.controller;

import com.dogrul.hotel.entity.Customer;
import com.dogrul.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> get() {
        return customerService.get();
    }

    @PostMapping("/customer")
    public Customer save(@RequestBody Customer customerObj){
        customerService.save(customerObj);
        return customerObj;
    }
}
