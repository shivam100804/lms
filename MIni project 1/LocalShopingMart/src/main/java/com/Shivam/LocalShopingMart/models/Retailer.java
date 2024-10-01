package com.Shivam.LocalShopingMart.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "retailers")
@Component
public class Retailer {

    private String fullname;
    private long aadhar;
    private String address;
    private int pin;
    @Id
    private long mobile;
//    private String email;
//    @Id
//    private String GSTIN;
//    private String Shopname;

}
