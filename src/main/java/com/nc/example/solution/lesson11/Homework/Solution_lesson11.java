package com.nc.example.solution.lesson11.Homework;

import com.nc.example.LessonAPI;

import java.util.Scanner;

public class Solution_lesson11 implements LessonAPI {
    @Override
    public void executeSolution(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                try {
                    String[] days = scanner.nextLine().split(" ");
                    DayOfWeek day = DayOfWeek.valueOf(days[0].toUpperCase());
                    for (String s : days) {
                        if (day.compareTo(DayOfWeek.valueOf(s.toUpperCase())) < 0) {
                            day = DayOfWeek.valueOf(s);
                        }
                    }
                    System.out.println(day.name() + ": " + day.infoAboutDay());
                } catch (IllegalArgumentException e) {
                    break;
                }
            } 
        }


    }
}

interface Day {
    String infoAboutDay();
}

enum DayOfWeek implements Day {
    MONDAY("Снова понедельник((("),
    TUESDAY("Опять вкалывать("),
    WEDNESDAY("Оу, уже среда"),
    THURSDAY("Скорее бы наступила пятнца"),
    FRIDAY("Наконец-то!!!"),
    SATURDAY("Можно спать сколько хочешь"),
    SUNDAY("Опять можно спать сколько хочешь");

    protected String info;

    DayOfWeek(String info) {
        this.info = info;
    }

    @Override
    public String infoAboutDay() {
        return info;
    }
}
