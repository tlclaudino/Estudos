// Exercicio 04 JAVA SENAC ADS 2º SEMESTRE

/*
*1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média.
*2) Crie um programa que imprima um arrays com Foreach. 
*3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores. 
*4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares. 
*5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imrpima elas. 
*6) Crie um programa que una duas listas de inteiros. 
*7) Crie um programa que simule a fila de atendimento de um banco. 
*8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano. 
*9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3. 
*10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.

DESAFIO
Crie um program aque questione 5 perguntas:
Telefonou a vítima?
Esteve no local do crime?
Mora perto da vítima?
Devia para a vítima?
Já trabalhou com a vítima?
Conforme as respostas sim, deve imprimir a classificação da pessoa que respondeu:

0-1 - Inocente
2 - Suspeita
3-4 - Cumplice
5 - Assassino
/**
@author Thiago Claudino
@version 1.0
@since 2023-08-21 
*/

import java.util.Scanner;

public class Exercicio4SenacAds {
    //1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float totalnota = 0;
    int choose;
    do {

        System.out.println("escolha uma opção");
        System.out.println("1 Inserir notas para calcular a média");
        System.out.println("2 Imprimir Array com Foreach");
        System.out.println(" 0 Sair");
        choose = sc.nextInt();

switch(choose){
    case 1:{

    System.out.println("Insira as notas e calcule as médias");
    System.out.println("Insira a quantidade de numeros que deseja verificar");
    
    int qntnota;
    qntnota = sc.nextInt();
    
    
    for (int i=1; i<=qntnota; i++) {
    System.out.println("Informe a "+ i +" nota:");
    float nota = sc.nextFloat();
    totalnota += nota;
    } 
    float media = totalnota/qntnota;
    System.out.println("A média das notas é "+ media);

    }
    //2) Crie um programa que imprima um arrays com Foreach. 
    case 2:{


    }

}

} while (choose != 0);
    
    sc.close();
}
}