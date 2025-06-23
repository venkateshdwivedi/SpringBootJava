package com.example.springbootdemo;

// import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringbootdemoApplication.class, args);
		
		Alien obj=context.getBean(Alien.class);
		System.out.println("age is "+obj.getAge());
		obj.code();
		 
		context.close();
	}

}
