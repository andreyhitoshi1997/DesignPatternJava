package org.behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        CentralCredito central = new CentralCredito();

        Colaborador score = new AnaliseScore(central);
        Colaborador restricao = new AnaliseRestricoes(central);
        Colaborador antifraude = new Antifraude(central);

        central.registrar(score);
        central.registrar(restricao);
        central.registrar(antifraude);

        score.enviar("Score > OK");
        System.out.println("-----");
        antifraude.enviar("Antifraude > Suspeita de golpe");
    }
}
