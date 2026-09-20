package com.example.SpringBootDemo;

import com.example.SpringBootDemo.module.Alien;
import com.example.SpringBootDemo.module.Laptop;
import com.example.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		Laptop lap = context.getBean(Laptop.class);
		LaptopService service = context.getBean(LaptopService.class);

		service.addLaptop(lap);




//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();


	}

}
