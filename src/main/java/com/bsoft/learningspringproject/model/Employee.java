package com.bsoft.learningspringproject.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    public Employee() {
    }

//    public Employee(String First, String Last) {
//        this.firstName = First;
//        this.lastName = Last;
//    }


    //Standard constructor, getters and setters
}
