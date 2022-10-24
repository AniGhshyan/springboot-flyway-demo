package com.example.springbootflywaydemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table()
public class Specialist {

    public Specialist(String name, BigDecimal salary, Specialty specialty) {
        this.name = name;
        this.salary = salary;
        this.specialty = specialty;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private BigDecimal salary;
    private Specialty specialty;


}
