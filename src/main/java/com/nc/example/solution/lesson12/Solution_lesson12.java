package com.nc.example.solution.lesson12;

import com.nc.example.LessonAPI;
import com.nc.example.lesson12.A;
import com.nc.example.lesson12.A_Factory;

public class Solution_lesson12 implements LessonAPI {
    @Override
    public void executeSolution(String[] args) {
        A a = A_Factory.newInstance();
        System.out.println(a);
    }
}
