package com.learngit;

public class Circle {
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*this.radius;
    }
}
