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
         Clientes cliente = new Clientes("Marta", 20);
         Funcionarios funcionario = new Funcionarios ("Jose", "Gerente", 5000);
     
         //cliente.nome = "Marta";
         //cliente.idade = 10;
         
         // cliente.setNome("Marta");
         // cliente.setIdade(18);
         
         System.out.println("Nome: " + cliente.getNome());
         System.out.println("Idade: " + cliente.getIdade());
         
         System.out.println("Dados do funcionário:");
         System.out.println("Nome: " + funcionario.getNome()); 
         System.out.println("Função: " + funcionario.getFuncao()); 
         System.out.println("Salário: " + funcionario.getSalario()); 
     }
 }
 
