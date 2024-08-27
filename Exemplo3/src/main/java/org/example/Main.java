package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Subtracao subtracao = new Subtracao();


        System.out.println("Soma: " + soma.calcular(10.0, 5.0));
        System.out.println("Divisão: " + divisao.calcular(10.0, 5.0));
        System.out.println("Multiplicação: " + multiplicacao.calcular(10.0, 5.0));
        System.out.println("Subtração: " + subtracao.calcular(10.0, 5.0));

    }
}
