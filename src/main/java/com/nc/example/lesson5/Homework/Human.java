package com.nc.example.lesson5.Homework;

public class Human {
    private int caloriesCnt;

    public Human() {
        this.caloriesCnt = 0;
    }

    public void eat(Fruit fruit) {
        this.caloriesCnt += fruit.getCalories();
        fruit.output();
    }

    public void infoCaloriesCnt() {
        System.out.println("Человек съел " + caloriesCnt + " каллорий");
    }
}
