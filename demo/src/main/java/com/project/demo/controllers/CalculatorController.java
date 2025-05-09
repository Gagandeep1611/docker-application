package com.project.demo.controllers;

import com.project.demo.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/calculate")
    public float calculate(@RequestBody String equation){
        return calculatorService.calculate(equation);
    }
}
