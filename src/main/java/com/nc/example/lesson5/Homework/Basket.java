package com.nc.example.lesson5.Homework;

public class Basket extends Container {

    public Basket() {
        super(20);
    }

    @Override
    public void trySetFruits(Fruit fruit) throws Exception{
        if (cnt < 20 && weight < 5) {
            setFruits(fruit);
        } else throw new Exception("Корзина заполнена! В нее больше ничего нельзя положить");
    }
}
