package com.example.springbootdemo;

// import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springbootdemo.model.Alien;
import com.example.springbootdemo.model.Laptop;
import com.example.springbootdemo.service.LaptopService;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringbootdemoApplication.class, args);
		
		// Alien obj=context.getBean(Alien.class);
		// System.out.println("age is "+obj.getAge());
		// obj.code();

		LaptopService service=context.getBean(LaptopService.class);
		Laptop lap=context.getBean(Laptop.class);
		service.addlaptop(lap);
		 
		context.close();
	}

}
