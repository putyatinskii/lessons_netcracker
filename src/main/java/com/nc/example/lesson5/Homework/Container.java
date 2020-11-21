package com.nc.example.lesson5.Homework;

public abstract class Container {
    protected int cnt;
    protected double weight;
    protected Fruit[] fruits;

    public Container(int n) {
        cnt = 0;
        weight = 0;
        fruits = new Fruit[n];
    }

    public int getCnt() {
        return cnt;
    }

    public Fruit getFruit() {
        --cnt;
        weight -= fruits[cnt].getWeight();
        return fruits[cnt];
    }

    public abstract void trySetFruits(Fruit fruit) throws Exception;

    protected void setFruits(Fruit fruit) throws Exception {
        fruits[cnt] = fruit.clone();
        ++cnt;
        weight += fruit.getWeight();
    }
}
