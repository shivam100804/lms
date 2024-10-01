package com.Shivam.LocalShopingMart.controllers;


import com.Shivam.LocalShopingMart.models.customer;
import com.Shivam.LocalShopingMart.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {

    @GetMapping("/customerSignup")
    public String customerSignup(){
        return "usersignup";
    }
    @Autowired
    CustomerService cs;

    @PostMapping("/signUpp")
    public String signUp(@ModelAttribute customer c1){
        try {
            cs.Signup(c1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "userlogin";
    }
    @GetMapping("/login")
    public String login() {
        return "userlogin"; // Return the name of your login view (e.g., a Thymeleaf or JSP page)
    }
}
