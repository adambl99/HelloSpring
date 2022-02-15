package com.example.exercisesspring1.controllers;

import com.example.exercisesspring1.services.CalculateDay;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/HelloWorld")
    public String Hello() {
        return "Hello World";
    }

    @GetMapping("/echo")
    public String getHello(@RequestParam String input) {
        return "Input: " + input;

    }
    @GetMapping("/ErDetFredag")
    public String findDay(@RequestParam int day, int month, int year)
    {
        CalculateDay calculateDay = new CalculateDay();

        return calculateDay.Zellercongruence(day, month, year);
    }
}
