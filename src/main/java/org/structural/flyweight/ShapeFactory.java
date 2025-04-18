package org.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> circleCache = new HashMap<>();

    public static Shape getCircle(String color) {
        if (!circleCache.containsKey(color)) {
            circleCache.put(color, new Circle(color));
            System.out.println("Criando novo círculo com cor: " + color);
        }
        return circleCache.get(color);
    }
}
