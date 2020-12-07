package com.nc.example.solution.lesson11.Classwork;

import com.nc.example.LessonAPI;

import java.util.function.Function;

public class Solution_lesson11_Classwork implements LessonAPI {
    @Override
    public void executeSolution(String[] args) {
//        CupOfTea cup = new CupOfTea();
//        cup.setT(Temp.HOT);
//        Temp temp = cup.getT();
//        System.out.println(temp.compareTo(Temp.COLD));
//        System.out.println(temp.name());
//        System.out.println(temp.ordinal());
//        Temp temp1 = Temp.valueOf("MEDIUM");
//        System.out.println(temp1.name() + " " + temp1.ordinal() + "\n");
//
//        for (Temp value : Temp.values()) {
//            System.out.println(value);
//        }
//        System.out.println("\n====================\n");
//
//        Animal animal = Cat.MANUL;
//        System.out.println(animal.voice());

        Function<String, String> function = (s) -> s + s + s.length();
        String s = "string";
        System.out.println(function.apply(s));


    }
}

interface Animal {
    String voice();
}

enum Cat implements Animal {
    MANUL("MEOW"),
    LEOPARD("RRRRRRRR");

    protected String voice;
    Cat(String voice) {
        this.voice = voice;
    }

    @Override
    public String voice() {
        return voice;
    }
}

class CupOfTea {
    Temp t;

    public Temp getT() {
        return t;
    }

    public void setT(Temp t) {
        this.t = t;
    }
}

enum Temp {
    COLD,
    MEDIUM,
    HOT
}