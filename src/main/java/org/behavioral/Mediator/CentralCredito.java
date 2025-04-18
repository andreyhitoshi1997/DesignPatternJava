package org.behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class CentralCredito implements MediadorCredito {
    private List<Colaborador> modulos = new ArrayList<>();

    public void registrar(Colaborador colaborador) {
        modulos.add(colaborador);
    }

    @Override
    public void enviar(String mensagem, Colaborador origem) {
        for (Colaborador c : modulos) {
            if (c != origem) {
                c.receber(mensagem);
            }
        }
    }
}

