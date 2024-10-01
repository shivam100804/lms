package com.Shivam.LocalShopingMart.repositories;


import com.Shivam.LocalShopingMart.models.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Repository
public interface customerRepository extends JpaRepository<customer,Integer> {
    Optional<customer> findByEmail(String email);
    //customer  findByEmail(String email);
//           @Query("select c from customer c where c.full_name = :fullname")
//    public customer getCustomerByCustomerName(@Param("fullname")String fullName);
//}
}
