package com.nc.example.lesson17;

import java.util.ArrayList;
import java.util.Arrays;

public class Thread2 extends Thread {

    @Override
    public void run() {
        Thread1.a.add(0);
        for(;!Thread.interrupted();) {
           synchronized(Thread1.a) {
               Thread1.a.add(0);
            }
        }
    }
}
