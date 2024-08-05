package com.mycompany.aula2;

import java.util.Scanner;

    public class Atividade2 {
        public static void main (String[] args) {
        Scanner numero = new Scanner(System.in);
            
        int menorNumero, primeiroNumero, segundoNumero;

        System.out.println("Informe o 1º número: ");
        primeiroNumero = numero.nextInt();

        System.out.println("Informe o 2º número: ");
        segundoNumero = numero.nextInt();

        if (primeiroNumero < segundoNumero) {
            menorNumero = primeiroNumero;
        } else {
            menorNumero = segundoNumero;
        }
            System.out.println("Menor Número: " + menorNumero);
    }
}
