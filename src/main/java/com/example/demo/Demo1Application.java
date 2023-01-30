package com.example.demo;

import com.example.demo.model.Laptop;
import com.example.demo.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Demo1Application.class, args);
        LaptopRepository laptopRepository = applicationContext.getBean(LaptopRepository.class);
        laptopRepository.save(new Laptop(null, "HP", 4500.0, "Black"));
        laptopRepository.save(new Laptop(null, "DELL", 2500.0, "Gray"));
    }

}
