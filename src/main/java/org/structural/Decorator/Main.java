package org.structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Beverage cafe = new SimpleCoffee(); // Café simples
        cafe = new MilkDecorator(cafe);     // Adiciona leite
        cafe = new ChocolateDecorator(cafe); // Adiciona chocolate

        System.out.println("Pedido: " + cafe.getDescription());
        System.out.println("Valor: R$ " + cafe.getCost());
    }
}
