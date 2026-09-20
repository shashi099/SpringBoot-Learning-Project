package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.module.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop lap){
        System.out.println("method called");
    }

    public boolean isGoodForProgramming(Laptop lap){
        return true;
    }

}
