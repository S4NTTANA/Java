package com.mycompany.aula2;

import java.util.Scanner;

public class notaMedia {
    public static void main (String[] args) {
        Scanner nota = new Scanner(System.in);
        
        String nome, resultado;
        int primeiraNota, segundaNota;
        float media;
        
        System.out.println("Informe o nome do aluno: ");
        nome = nota.next();
        
        System.out.println("Infomre o valor da 1ª nota: ");
        primeiraNota = nota.nextInt();
        
        System.out.println("Infomre o valor da 2ª nota: ");
        segundaNota = nota.nextInt();
        
        media = (primeiraNota + segundaNota) / 2;
        
        if (media < 7) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }
        
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
    }
    
}
