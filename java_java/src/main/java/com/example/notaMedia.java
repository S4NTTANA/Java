package com.mycompany.aula2;

import java.util.Scanner;

public class notaMedia {
    public static void main (String[] args) {
        Scanner nota = new Scanner(System.in);
        /** 
         * String nome, resultado;
         * double primeiraNota, segundaNota;
         * float media;
         */
        
        System.out.println("Informe o nome do aluno: ");
        nome = nota.next();
        
        System.out.println("Infomre o valor da 1ª nota: ");
        int primeiraNota = nota.nextDouble();
        
        System.out.println("Infomre o valor da 2ª nota: ");
        int segundaNota = nota.nextDouble();
        
        double media = (primeiraNota + segundaNota) / 2;
        
        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5){
            resultado = "Verificação suplementar";
        } else {
            resultado = "Reprovado";
        }
        
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
    }
    
}