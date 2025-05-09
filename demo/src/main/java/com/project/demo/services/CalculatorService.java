package com.project.demo.services;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CalculatorService {

    public float calculate(String equation) {
        Expression expression = new ExpressionBuilder(equation).build();
        double result = expression.evaluate();
        return (float)result;
    }
}