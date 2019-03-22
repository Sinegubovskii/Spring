package com.first.IOC.demo;

public class BaseballCoach implements iCoach{

    @Override
    public String getDailyWorkout(){

        return "running 30 mins ";
    }
}
