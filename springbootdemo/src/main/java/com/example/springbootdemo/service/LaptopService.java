package com.example.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo.model.Laptop;
import com.example.springbootdemo.repo.LaptopRepo;

@Service
public class LaptopService {

    @Autowired
    LaptopRepo laprepo;

    public void addlaptop(Laptop lap){
        laprepo.add(lap);
    }
}
