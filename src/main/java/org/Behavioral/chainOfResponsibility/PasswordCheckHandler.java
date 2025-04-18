package org.Behavioral.chainOfResponsibility;

public class PasswordCheckHandler extends Handler {
    @Override
    public boolean handle(String username, String password) {
        if (!password.equals("123456")) {
            System.out.println("Erro: Senha incorreta.");
            return false;
        }
        System.out.println("Login bem-sucedido!");
        return true;
    }
}

