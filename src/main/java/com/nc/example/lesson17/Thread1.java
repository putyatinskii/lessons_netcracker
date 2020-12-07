package com.nc.example.lesson17;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Thread1 extends Thread{

    public static ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2, 3, 4, 5, 5));

    public static ArrayList<Integer> getA() {
        return a;
    }

    @Override
    public void run() {
        for (;!Thread.interrupted();) {
            synchronized (a){
                System.out.println(a);
            }
        }
    }
}
