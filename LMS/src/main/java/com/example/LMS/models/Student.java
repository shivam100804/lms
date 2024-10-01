package com.example.LMS.models;


import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Entity
@Table(name="Student")
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    private int age;
    private String country;
    @CreationTimestamp
    private Date createdOn;
    @UpdateTimestamp
    private Date updateOn;

    public Student(int id, String name, int age, Date createdOn, Date updateOn) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.createdOn = createdOn;
        this.updateOn = updateOn;
    }
    @OneToOne(mappedBy = "s1", cascade = CascadeType.ALL)
    private Card c1;
}
