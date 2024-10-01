package com.Shivam.LocalShopingMart.services;


import com.Shivam.LocalShopingMart.models.customer;
import com.Shivam.LocalShopingMart.repositories.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService
{

    @Autowired
    customerRepository c1;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public void Signup(customer Customer) throws Exception {
        Optional<customer> existingCustomer = c1.findByEmail(Customer.getEmail());
        if (existingCustomer.isPresent()){
            throw new Exception("user already registered");
        }
        Customer.setPassword(passwordEncoder.encode(Customer.getPassword()));
        c1.save(Customer);

    }
}
