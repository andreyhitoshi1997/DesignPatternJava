package org.behavioral.chainOfResponsibility;

public class RequiredFieldsHandler extends Handler {
    @Override
    public boolean handle(String username, String password) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            System.out.println("Erro: Usuário e senha são obrigatórios.");
            return false;
        }
        return next == null || next.handle(username, password);
    }
}

