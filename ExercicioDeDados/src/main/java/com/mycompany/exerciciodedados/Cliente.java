package com.mycompany.exerciciodedados;

public class Cliente extends Fisica {
    
    private String ProtocoloAtendimento;

    public Cliente(String ProtocoloAtendimento) {
        this.ProtocoloAtendimento = ProtocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return ProtocoloAtendimento;
    }

    public void setProtocoloAtendimento(String ProtocoloAtendimento) {
        this.ProtocoloAtendimento = ProtocoloAtendimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "ProtocoloAtendimento=" + ProtocoloAtendimento + '}';
    }
    
    
}
