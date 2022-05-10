package com.example.Placement.controller;

import com.example.Placement.model.Customer;
import com.example.Placement.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/Customer")
@RestController
public class CustomerController {
    private final CustomerService cr;

    public CustomerController(CustomerService cr) {
        this.cr = cr;
    }

    @GetMapping(value="/getAllCustomers")
    public List<Customer> getAllCustomers() {
        return cr.getAllCustomers();
    }

    @PostMapping(value="/addCustomer")
    public Customer addCustomer(@RequestBody Customer c) {
        return cr.add(c);
    }

}
