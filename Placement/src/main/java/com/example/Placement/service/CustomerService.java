package com.example.Placement.service;

import com.example.Placement.model.Customer;
import com.example.Placement.repositories.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo cr;

    public CustomerService(CustomerRepo cr) {
        this.cr = cr;
    }

    public List<Customer> getAllCustomers() {
        return cr.findAll();
    }

    public Customer add(Customer customer) {
        return cr.save(customer);
    }

}
