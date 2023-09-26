package com.spring.boot.Project_with_SpringBoot.entities;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Entity
@Table(name = "employees")
@Setter
@Getter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor  // custom constructor for all fields with @NonNull
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;       // JpaRepository<xxx, Integer> , Integer as a wrapper for int type
    @NonNull
    @Column(name = "name")
    private String name;
    @NonNull
    @Column(name = "surname")
    private String surname;
    @NonNull
    @Column(name = "department")
    private String department;
    @NonNull
    @Column(name = "salary")
    private BigInteger salary;
}
