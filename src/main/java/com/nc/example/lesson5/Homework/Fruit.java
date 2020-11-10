package com.nc.example.lesson5.Homework;

public abstract class Fruit implements Cloneable {
    protected double weight;
    protected int calories;

    public Fruit(double weight, int calories) {
        this.weight = weight;
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    protected Fruit clone() {
        try {
            return (Fruit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }

    public abstract void output();
}
