package com.ormispring.springdatajpaexample.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String address;
}