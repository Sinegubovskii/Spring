package com.first.IOC.demo;

public class MyApp {
    public static  void main(String[] arg){

        iCoach theCoach = new BaseballCoach();
        System.out.println(theCoach.getDailyWorkout());

    }

}
