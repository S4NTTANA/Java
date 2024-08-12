/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.componentes;

/**
 *
 * @author aluno.den
 */
public class Componentes {

    public static void main(String[] args) {
        Processador processador1 = new Processador ("AMD", "Ryzen 5", "2.2 Ghz");  
        
        Processador processador2 = new Processador ("Intel", "i5", "2.0 Ghz");  
        
        Memória memoria1 = new Memória ("Kingston", "Fury Hyperx 8gb", "256 GB");
        
        System.out.println("=== Dados do Processador ===");
        System.out.println("Marca: " + processador1.getMarca());
        System.out.println("Modelo: " + processador1.getModelo());
        System.out.println("Frequência: " + processador1.getFrequencia());
   
        System.out.println("\n");
        
        System.out.println("=== Dados da Memória ===");
        System.out.println("Marca: " + memoria1.getMarca());
        System.out.println("Modelo: " + memoria1.getModelo());
        System.out.println("Capacidade de Armazenamento: " + memoria1.getCapacidadeDeArmazenamento());
    }
}
