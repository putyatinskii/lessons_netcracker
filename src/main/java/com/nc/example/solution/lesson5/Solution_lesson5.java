package com.nc.example.solution.lesson5;
import com.nc.example.LessonAPI;

import com.nc.example.lesson5.Homework.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution_lesson5 implements LessonAPI {
    @Override
    public void executeSolution(String[] args) {
        Container basket = new Basket();
        Container container = new Plastic_Container();

        Fruit banana = new Banana(0.3, 267);
        Fruit banana1 = new Banana(0.2, 178);
        Fruit apple = new Apple(0.25, 130);
        Fruit apple1 = new Apple(0.35, 150);
        Fruit orange = new Orange(0.2, 95);
        Fruit orange1 = new Orange(0.4, 190);

        try {
            container.trySetFruits(banana);
            container.trySetFruits(banana1);
            container.trySetFruits(orange);

            basket.trySetFruits(orange1);
            basket.trySetFruits(apple);
            basket.trySetFruits(apple1);
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
            basket.trySetFruits(new Apple(0.3, 140));
            human.eat(basket.getFruit());
            human.infoCaloriesCnt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
