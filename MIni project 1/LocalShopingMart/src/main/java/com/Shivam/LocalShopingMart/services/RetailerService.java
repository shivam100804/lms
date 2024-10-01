package com.Shivam.LocalShopingMart.services;

import com.Shivam.LocalShopingMart.models.Retailer;
import com.Shivam.LocalShopingMart.repositories.RetailerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetailerService {
    @Autowired
    RetailerRepository r1;

    public void addRetailer(Retailer re1){
        r1.save(re1);
    }
}
