package com.example.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("compiling using laptop");
    }
}
