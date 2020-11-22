package com.nc.example.lesson8;

import java.util.Random;

public class RandomProvider implements AutoCloseable {
    private int array[];
    private int cnt = 0;

    public RandomProvider(int n) {
        this.array = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            array[i] = random.nextInt(1000);
        }
    }

    public int getElem() throws ArrayIndexOutOfBoundsException {
            return array[cnt++];
    }

    @Override
    public void close() throws Exception {
        array = null;
        System.out.println("Массив очищен");
    }
}
