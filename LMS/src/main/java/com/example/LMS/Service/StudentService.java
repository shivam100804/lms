package com.example.LMS.Service;

import com.example.LMS.ENUM.cardStatus;
import com.example.LMS.Repository.StudentRepository;
import com.example.LMS.RequestDto.studentDto;
import com.example.LMS.models.Card;
import com.example.LMS.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository sr;
    public void addStudent(studentDto s1) {
        Student sd = new Student();
        sd.setAge(s1.getAge());
        sd.setName(s1.getName());
        sd.setCountry(s1.getCountry());
        Card c2 = new Card();
        c2.setC1(cardStatus.ACTIVATED);
        c2.setS1(sd);
        sd.setC1(c2);
        sr.save(sd);
    }
}
