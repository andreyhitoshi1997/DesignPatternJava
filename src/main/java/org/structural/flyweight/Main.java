package org.structural.flyweight;

public class Main {
    private static final String[] colors = { "vermelho", "verde", "azul", "amarelo", "preto" };

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String cor = colors[i % colors.length];
            Shape circle = ShapeFactory.getCircle(cor);
            int x = (int)(Math.random() * 100);
            int y = (int)(Math.random() * 100);
            circle.draw(x, y);
        }
    }
}

