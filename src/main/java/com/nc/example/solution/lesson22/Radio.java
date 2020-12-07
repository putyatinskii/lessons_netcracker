package com.nc.example.solution.lesson22;

public class Radio {

    private String name;

    public Radio(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void playMusic() {
        System.out.println(getName() + ": MUSIC");
    }
}
