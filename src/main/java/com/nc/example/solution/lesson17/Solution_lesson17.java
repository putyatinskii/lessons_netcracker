package com.nc.example.solution.lesson17;

import com.nc.example.LessonAPI;
import com.nc.example.lesson17.Thread1;
import com.nc.example.lesson17.Thread2;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution_lesson17 implements LessonAPI {

    static Thread1 t1;
    static Thread2 t2;
    @Override
    public void executeSolution(String[] args) {

        t1 = new Thread1();
        t2 = new Thread2();
        t1.start();
        t2.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
        t2.interrupt();
    }
}
