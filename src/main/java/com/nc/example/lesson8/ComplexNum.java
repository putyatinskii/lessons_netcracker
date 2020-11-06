package com.nc.example.lesson8;

import java.util.Objects;

public class ComplexNum {
    private int a;
    private int i;

    public ComplexNum(int a, int i) {
        this.a = a;
        this.i = i;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexNum that = (ComplexNum) obj;
        return a == that.a &&
                i == that.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, i);
    }
}
