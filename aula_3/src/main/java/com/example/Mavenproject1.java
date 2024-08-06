/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.mavenproject1;
 //package com.mycompany.mavenproject1.Clientes;
 /**
  *
  * @author aluno.den
  */
 public class Mavenproject1 {
 
     public static void main(String[] args) {
         // Instanciando um objeto
         Clientes cliente;
         cliente = new Clientes("Marta", 18);
     
         //cliente.nome = "Marta";
         //cliente.idade = 10;
         
         cliente.setNome("Marta");
         cliente.setIdade(18);
         
         System.out.println("Nome: " + cliente.getNome());
         System.out.println("Idade: " + cliente.getIdade());
     }
 }
 