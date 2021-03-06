package com.nc.example.solution.lesson22;


import com.nc.example.LessonAPI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_lesson22 implements LessonAPI {

    @Override
    public void executeSolution(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Radio firstRadio = (Radio) applicationContext.getBean("first");
        Radio secondRadio = (Radio) applicationContext.getBean("second");
        Radio thirdRadio = (Radio) applicationContext.getBean("third");
        Radio fourthRadio = (Radio) applicationContext.getBean("fourth");
        try(Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                switch(scanner.nextLine()) {
                    case "1":
                        firstRadio.playMusic();
                        break;
                    case "2":
                        secondRadio.playMusic();
                        break;
                    case "3":
                        thirdRadio.playMusic();
                        break;
                    case "4":
                        fourthRadio.playMusic();
                        break;
                }
            }
        }
    }
}
