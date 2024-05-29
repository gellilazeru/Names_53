package com.example.task_01.controllers;

import com.example.task_01.models.Greeting;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// default to http://localhost:8080/greetings
// @RequestMapping(value = "/greeting"): this is for every GET request

public class TaskController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(defaultValue = " ") String timeOfDay) {
        Greeting greeting = new Greeting("Colin", timeOfDay);
        return greeting;
    }

}

