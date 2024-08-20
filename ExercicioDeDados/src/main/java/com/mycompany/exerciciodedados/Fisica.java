package com.mycompany.exerciciodedados;

public class Fisica {
    protected Sexo sexo;
    protected EstadoCivil estadocivil;
    protected String dataNascimento;

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Fisica{" + "sexo=" + sexo + ", estadocivil=" + estadocivil + ", dataNascimento=" + dataNascimento + '}';
    }
    
    
}
