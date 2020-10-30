package com.nc.example.lesson4;

public class Square extends Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a > 0) this.a = a;
        else throw new IllegalArgumentException();
    }

    @Override
    public double square() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return a * 4;
    }

    @Override
    public void draw() {
        System.out.println("Рисунок квадрата");
    }
}
