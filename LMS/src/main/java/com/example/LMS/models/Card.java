package com.example.LMS.models;


import com.example.LMS.ENUM.cardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Table(name="card")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cardId")
    private int id;
    @Enumerated(value = EnumType.STRING)
    private cardStatus c1;
    @OneToOne
    @JoinColumn
    private Student s1;

    @OneToMany(mappedBy = "card" , cascade = CascadeType.ALL)
    private Book b1;
}
