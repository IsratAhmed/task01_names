package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "timeOfDay") String timeOfDay, String name) {
        return timeOfDay + name;

    }

    @GetMapping
    public Greeting newGreeting(){
        return new Greeting("Israt", "Good afternoon");
    }

    @GetMapping
    public Celebration newCelebration(){
        Greeting greeting = new Greeting("Israt", "Good afternoon");
        return new Celebration("Merry Christmas!");
    }
}
