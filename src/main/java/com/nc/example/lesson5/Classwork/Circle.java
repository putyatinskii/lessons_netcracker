package com.nc.example.lesson5.Classwork;

public class Circle extends Figure {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if (r > 0) this.r = r;
        else throw new IllegalArgumentException();

    }

    @Override
    public double square() {
        return Math.PI*this.r*this.r;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*this.r;
    }

    @Override
    public void draw() {
        System.out.println("Рисунок круга");
    }
}
