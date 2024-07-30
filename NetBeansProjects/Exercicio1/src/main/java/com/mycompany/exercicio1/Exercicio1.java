package com.mycompany.exercicio1;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o seu nome: ");
        String nome = teclado.next();
        
        System.out.println("Informe a sua idade: ");
        int idade = teclado.nextInt();
       
        System.out.println("Informe o seu peso: ");
        double peso = teclado.nextDouble();
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso); 
        
    }
}
