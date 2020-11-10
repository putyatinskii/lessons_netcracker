package com.nc.example.lesson5.Homework;

public class Container {
    private int cnt;
    private double weight;
    private Fruit[] fruits;

    public Container() {
        cnt = 0;
        weight = 0;
        fruits = new Fruit[5];
    }

    public int getCnt() {
        return cnt;
    }

    public Fruit getFruit() {
        --cnt;
        weight -= fruits[cnt].getWeight();
        return fruits[cnt];
    }

    public void setFruits(Fruit fruit) throws Exception {
        if (cnt < 5 && weight < 1) {
            fruits[cnt] = fruit.clone();
            ++cnt;
            weight += fruit.getWeight();
        } else throw new Exception("Контейнер заполнен! В него больше ничего нельзя положить");
    }
}
