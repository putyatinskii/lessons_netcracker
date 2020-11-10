package com.nc.example.solution.lesson5;
import com.nc.example.LessonAPI;

import com.nc.example.lesson5.Classwork.*;
import com.nc.example.lesson5.Homework.*;

import java.util.Base64;

public class Solution_lesson5 implements LessonAPI {
    @Override
    public void executeSolution(String[] args) {
        Basket basket = new Basket();
        Container container = new Container();

        Fruit banana = new Banana(0.3, 267);
        Fruit banana1 = new Banana(0.2, 178);
        Fruit apple = new Apple(0.25, 130);
        Fruit apple1 = new Apple(0.35, 150);
        Fruit orange = new Orange(0.2, 95);
        Fruit orange1 = new Orange(0.4, 190);

        try {
            container.setFruits(banana);
            container.setFruits(banana1);
            container.setFruits(orange);

            basket.setFruits(orange1);
            basket.setFruits(apple);
            basket.setFruits(apple1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Human human = new Human();

        human.eat(basket.getFruit());
        human.eat(basket.getFruit());

        human.eat(container.getFruit());
        human.eat(container.getFruit());
        human.infoCaloriesCnt();

        try {
            basket.setFruits(new Apple(0.3, 140));
            human.eat(basket.getFruit());
            human.infoCaloriesCnt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
