package org.example;

import static org.example.Genero.MASCULINO;
import static org.example.Setor.FINANCEIRO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(5649, "Joao", 5645.98, FINANCEIRO, MASCULINO, 35);
        System.out.println("ID: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println("Gênero: " + funcionario.getGenero());
        System.out.println("Idade: " + funcionario.getIdade());


        }
    }