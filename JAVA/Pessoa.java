//Exercícios de Revisão
//1) Crie uma classe que represente uma Pessoa, devendo ter as propriedades Nome, Peso, Altura e Data de Nascimento e o método IMC, que retornará o valor do IMC. 
//2) Crie um programa que receba a pessoa criada e verifique qual o IMC.

//IMC	Classificação
//Abaixo de 18,5	Abaixo do Peso
//Entre 18,6 e 24,9	Peso Ideal
//Entre 25,0 e 29,9	Levemente acima do peso
//Entre 30,0 e 34,9	Obesidade Grau I
//Entre 35,0 e 39,9	Obesidade Grau II
//Acima de 40	Obesidade Grau III (mórbida)

//3) Crie uma classe que represente uma Conta Corrente, devendo ter as propriedades Número da Conta, Agência, Saldo, Nome do Titular e os métodos Depósito, Saque e Saldo Total. 
//4) Crie um programa que receba a conta corrente e deposite e saque valores, ao final imprimindo o saldo existente. 
//5) Crie uma classe que calcule a área de uma circunferência, recebendo com valor inicial o raio 

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {


    public String nome; //atributos
    public double peso;
    public double altura;
    public String dataNascimento;



    public Pessoa (String nome, double peso, double altura, LocalDate dataNascimento)  { //parametros
        this.nome = nome; //this representa o objeto na qual vc ta trabalhando
        this.peso = peso;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
    }

    public double calcularIMC() { //cria o metodo
        return this.peso /(this.altura*this.altura);
            
            
            

    }