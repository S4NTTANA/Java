package com.mycompany.componentes;

public class Processador extends Produto{
    private String frenquencia;

    public Processador(String frenquencia, String marca, String modelo) {
        super(marca, modelo);
        this.frenquencia = frenquencia;
    }

    public String getFrenquencia() {
        return frenquencia;
    }

    public void setFrenquencia(String frenquencia) {
        this.frenquencia = frenquencia;
    }
    
    
    
}
    

