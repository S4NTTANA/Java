package org.example;

public class Motorista {
    private String carteiraDeHabilitacao;

    public Motorista(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "carteiraDeHabilitacao='" + carteiraDeHabilitacao + '\'' +
                '}';
    }
}
