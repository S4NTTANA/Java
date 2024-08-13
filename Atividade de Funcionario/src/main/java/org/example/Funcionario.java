package org.example;

public class Funcionario {
    int id;
    String nome;
    double salario;
    Setor setor;
    org.example.Genero genero;
    int idade;

    public Funcionario(int id, String nome, double salario, Setor setor, org.example.Genero genero, int idade) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.genero = genero;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public org.example.Genero getGenero() {
        return genero;
    }

    public void setGenero(org.example.Genero genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
