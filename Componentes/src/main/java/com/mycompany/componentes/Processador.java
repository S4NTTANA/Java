package com.mycompany.componentes;

public class Processador {
    
    private String marca;
    private String modelo;
    private String frequencia;

    public Processador(String marca, String modelo, String frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
    
    
    
}
