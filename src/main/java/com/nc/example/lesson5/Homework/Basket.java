package com.nc.example.lesson5.Homework;

public class Basket {
    private int cnt;
    private double weight;
    private Fruit[] fruits;

    public Basket() {
        cnt = 0;
        weight = 0;
        fruits = new Fruit[20];
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
        if (cnt < 20 && weight < 5) {
            fruits[cnt] = fruit.clone();
            ++cnt;
            weight += fruit.getWeight();
        } else throw new Exception("Корзина заполнена! В нее больше ничего нельзя положить");
    }
}
