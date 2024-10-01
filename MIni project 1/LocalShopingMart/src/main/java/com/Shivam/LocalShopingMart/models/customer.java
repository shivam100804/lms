package com.Shivam.LocalShopingMart.models;

//name of customer as FullName
//email of customer as email
//mobile number of customers as mobNo

import com.Shivam.LocalShopingMart.ENUMS.loginStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Table(name="customer")
public class customer {
    @Column(name="full_name")
    private String username;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    @Column(name="mob_no")
    private long mobNo;
    @Column(name="isLoggedIn")
    @Enumerated(value = EnumType.STRING)
    private loginStatus isLoggedIn=loginStatus.no;
    private String password;
}
