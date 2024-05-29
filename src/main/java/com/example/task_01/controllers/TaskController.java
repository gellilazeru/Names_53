package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// default to http://localhost:8080/greeting
@RequestMapping(value = "/greeting")
//: this is for every GET request

public class TaskController {

    @GetMapping
    public Greeting greeting(@RequestParam(defaultValue = " ") String timeOfDay) {
        Greeting greeting = new Greeting("Colin", timeOfDay);
        return greeting;
    }

    @GetMapping("/summer")
    public Celebration celebration(@RequestParam(defaultValue = " ") String message) {
        Celebration celebration = new Celebration(message);
        return celebration;
    }

}

