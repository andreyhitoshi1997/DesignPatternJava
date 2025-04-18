package org.structural.flyweight;

public class Circle implements Shape {
    private final String color; // estado intrínseco (compartilhado)

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Desenhando círculo [" + color + "] na posição (" + x + ", " + y + ")");
    }
}
