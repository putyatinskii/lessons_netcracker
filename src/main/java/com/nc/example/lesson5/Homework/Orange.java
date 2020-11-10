package com.nc.example.lesson5.Homework;

public class Orange extends Fruit {

    public Orange(double weight, int calories) {
        super(weight, calories);
    }

    @Override
    public void output() {
        System.out.println("Съеден апельсин");
    }
}
