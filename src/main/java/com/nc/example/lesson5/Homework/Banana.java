package com.nc.example.lesson5.Homework;

public class Banana extends Fruit {

    public Banana(double weight, int calories) {
        super(weight, calories);
    }

    @Override
    public void output() {
        System.out.println("Съеден банан");
    }
}
