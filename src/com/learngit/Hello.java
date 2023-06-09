package com.learngit;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Circle c1 = new Circle();
        c1.setRadius(4);
        System.out.println("Perimeter Of Circle: "+c1.calculatePerimeter());
    }
}
