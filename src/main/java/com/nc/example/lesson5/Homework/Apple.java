package com.nc.example.lesson5.Homework;

public class Apple extends Fruit {

    public Apple(double weight, int calories) {
        super(weight, calories);
    }

    @Override
    public void output() {
        System.out.println("Съедено яблоко");
    }
}
