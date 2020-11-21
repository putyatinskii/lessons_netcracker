package com.nc.example.lesson5.Homework;

public class Plastic_Container extends Container {

    public Plastic_Container() {
        super(5);
    }

    @Override
    public void trySetFruits(Fruit fruit) throws Exception {
        if (cnt < 5 && weight < 1) {
            setFruits(fruit);
        } else throw new Exception("Контейнер заполнен! В него больше ничего нельзя положить");
    }
}
