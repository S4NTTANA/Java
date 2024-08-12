
package com.mycompany.componentes;

public class Memória {
    
    private String marca;
    private String modelo;
    private String capacidadeDeArmazenamento;

    public Memória(String marca, String modelo, String capacidadeDeArmazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
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

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }
    
}
