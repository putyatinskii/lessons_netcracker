package com.nc.example.solution.lesson3;

import com.nc.example.LessonAPI;
import com.nc.example.lesson3.Car;

public class Solution_lesson3 implements LessonAPI {
    @Override
    public void executeSolution(String[] args) {
        Car car = new Car.Builder("Sedan", 3_000_000, "Mercedes-Benz").
                equipment("full").
                model("A-class").
                number_of_seats(4).
                build();
        System.out.println(car);
    }
}