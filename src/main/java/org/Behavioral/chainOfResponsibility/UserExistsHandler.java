package org.Behavioral.chainOfResponsibility;

public class UserExistsHandler extends Handler {
    @Override
    public boolean handle(String username, String password) {
        if (!username.equals("andrey.dev")) {
            System.out.println("Erro: Usuário não encontrado.");
            return false;
        }
        return next == null || next.handle(username, password);
    }
}
