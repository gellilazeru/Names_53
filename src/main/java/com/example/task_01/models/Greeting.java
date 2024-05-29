package com.example.task_01.models;

// default constructor with 1 empty parameter
// must have private properties, setters and getters


public class Greeting {

    private String name;
    private String timeOfDay;

    public Greeting(String name, String timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public Greeting(){

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTimeOfDay(){
        return this.timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay){
        this.timeOfDay = timeOfDay;
    }



}
