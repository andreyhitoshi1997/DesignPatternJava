package org.Behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler chain = new RequiredFieldsHandler();
        chain.setNext(new UserExistsHandler())
                .setNext(new PasswordCheckHandler());

        // Teste 1: Campos vazios
        chain.handle("", "");

        System.out.println("-----");

        // Teste 2: Usuário não existe
        chain.handle("invalido", "123456");

        System.out.println("-----");

        // Teste 3: Senha incorreta
        chain.handle("andrey.dev", "errada");

        System.out.println("-----");

        // Teste 4: Login correto
        chain.handle("andrey.dev", "123456");
    }
}

