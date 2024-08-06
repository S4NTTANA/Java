/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.atividade1;

 /**
  *
  * @author aluno.den
  */
 public class Principal {
 
     public static void main(String[] args) {
         // Instalando um objeto
         Livro livro1 = new Livro ("Romeu e Julieta", "William Shakespeare", 896, 469 );
         Livro livro2 = new Livro ("Hamlet", "William Shakespeare", 627, 526 );
         
         
         System.out.println("==== Dados do Livro ====");
         System.out.println("Título do livro: " + livro1.getTitulo());
         System.out.println("Autor do livro" + livro1.getAutor());
         System.out.println("Número de páginas: " + livro1.getNumeroDePaginas());
         System.out.println("Preço do livro: " + livro1.getPreco());
         
     }
 }
 