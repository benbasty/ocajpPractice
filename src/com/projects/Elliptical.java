package com.projects;

public class Elliptical {
    private int radiusA, radiusB;
    private int sum = 200;

    public void setRadius(int r){
        if(r>99) throw new IllegalArgumentException();
        radiusA = r;
        radiusB = sum - radiusA;

    }
}
