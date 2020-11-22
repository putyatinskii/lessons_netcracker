package com.nc.example.solution.lesson8;

import java.lang.reflect.Method;
import java.sql.SQLOutput;

import com.nc.example.LessonAPI;
import com.nc.example.Main;
import com.nc.example.lesson8.ComplexNum;
import com.nc.example.lesson8.RandomProvider;
import com.nc.example.lesson8.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import  org.apache.log4j.BasicConfigurator;


public class Solution_lesson8 implements LessonAPI {

    private static final Logger LOGGER = LoggerFactory.getLogger(Solution_lesson8.class);

    @Override
    public void executeSolution(String[] args) {
//        Role role = new Role();
//        Class<? extends Role> clazz = role.getClass();
//        Class<Role> roleClass = Role.class;
//        System.out.println(clazz.getName());
//        System.out.println(roleClass.getName());
//        for (Method declaredMethod: clazz.getDeclaredMethods()) {
//            System.out.println(declaredMethod.getName());
//        }
//        System.out.println(role instanceof  Object);



//        ComplexNum c = new ComplexNum(1,2);
//        LOGGER.info("Out object {}", c);
//
//        try {
//            int a = 1/0;
//        } catch (Exception e) {
//            LOGGER.error("ERROR");
//        }

        BasicConfigurator.configure();
        try(RandomProvider randomProvider = new RandomProvider(10)) {
            for (int i = 0; i < 11; i++) {
                System.out.println(randomProvider.getElem());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            LOGGER.error("Ошибка! Выход за границу массива!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
