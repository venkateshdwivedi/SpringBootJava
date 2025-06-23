package com.example.springbootdemo.repo;

import org.springframework.stereotype.Repository;

import com.example.springbootdemo.model.Laptop;

@Repository
public class LaptopRepo {

    public void add(Laptop lap){
        System.out.println("laptop added using repository layer");
    }
}
