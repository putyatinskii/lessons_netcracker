package com.nc.example.solution.lesson3;

import com.nc.example.lesson3.Car;

public class Solution1 {
    public static void run(String[] args) {
        Car car = new Car.Builder("Sedan", 3_000_000, "Mercedes-Benz").
                equipment("full").
                model("A-class").
                number_of_seats(4).
                build();
        System.out.println(car);
    }
}