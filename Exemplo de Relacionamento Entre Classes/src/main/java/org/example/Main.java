package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(4568, "Jorge", 36, 4002-8922, "jorge56@gmail.com",
                sexo.MASCULINO, new Endereco("R. São Cristovão", "26-G", "Ao lado do Mercado São José", "80502-46", "Salvador", UnidadeFederativa.BAHIA));

        System.out.println("ID: " + pessoa.getId());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("==== Endereço ====");
        System.out.println("Logradouro: " + pessoa.getEndereco().getLogradoutro());
        System.out.println("Número: " + pessoa.getEndereco().getNumero());
        System.out.println("Complemento: " + pessoa.getEndereco().getComplemento());
        System.out.println("CEP: " + pessoa.getEndereco().getCep());
        System.out.println("Cidade: " + pessoa.getEndereco().getCidade());
        System.out.println("UF: " + pessoa.getEndereco().getUnidadeFederativa());

        }

    }