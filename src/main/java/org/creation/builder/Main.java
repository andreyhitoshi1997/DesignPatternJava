package org.creation.builder;

public class Main {
    public static void main(String[] args) {
        // Criação de um usuário com alguns campos opcionais
        User user = new User.Builder("Andrey", "Onoue")
                .age(27)
                .phone("11999999999")
                .address("São Paulo - SP")
                .build();

        System.out.println("Nome: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Idade: " + user.getAge());
        System.out.println("Telefone: " + user.getPhone());
        System.out.println("Endereço: " + user.getAddress());
    }
}
