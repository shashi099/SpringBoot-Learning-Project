package com.example.SpringBootDemo;

import com.example.SpringBootDemo.module.Laptop;
import org.springframework.stereotype.Repository;

/*
THIS CLASS IS RESPONSIBLE FOR DATABASE CONNECTIVITY AND ALL THE CRUD OPERATIONS

 */

@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("Data Base Connectivity Successfully");
    }

}
