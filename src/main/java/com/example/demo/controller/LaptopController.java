package com.example.demo.controller;

import com.example.demo.model.Laptop;
import com.example.demo.repository.LaptopRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/laptops")
    public List<Laptop> findAll() {
        return this.laptopRepository.findAll();
    }

    @PostMapping("/laptops")
    public Laptop create(@RequestBody Laptop laptop) {
        this.laptopRepository.save(laptop);
        return laptop;
    }

}
