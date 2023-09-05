// Exercicio 04 JAVA SENAC ADS 2º SEMESTRE JACKSON

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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio4SenacAds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalnota = 0;
        int choose;
        do {

            System.out.println("escolha uma opção");
            System.out.println("1 Inserir notas para calcular a média");
            System.out.println("2 Imprimir Array com Foreach");
            System.out.println("3 Imprimir valores introduzidos no Array");
            System.out.println("4 Imprimir valores introduzidos no Array para saber se são par ou impar");
            System.out.println("5 Imprimir as cartas de um baralho");
            System.out.println("6 Imprimir duas listas unidas");
            System.out.println("7 Simule a fila de um banco");
            System.out.println("8 Adicione a temperatura de cada mês do ano para saber a media anual");
            System.out.println("9 Preencha dois arrays para ver os valores intercalados");
            System.out.println("10 Insira 20 valores para saber a média e obter os numeros interiores a média");
            System.out.println("11 DESAFIO INVESTIGAÇÃO");
            System.out.println(" 0 Sair");
            choose = sc.nextInt();

            switch (choose) {
                // 1) Crie um programa que questione a quantidade de notas a ser informada,
                // receba as notas e calcule a média.
                case 1: {

                    System.out.println("Insira as notas e calcule as médias");
                    System.out.println("Insira a quantidade de numeros que deseja verificar");

                    int qntnota;
                    qntnota = sc.nextInt();

                    for (int i = 1; i <= qntnota; i++) {
                        System.out.println("Informe a " + i + " nota:");
                        float nota = sc.nextFloat();
                        totalnota += nota;
                    }
                    float media = totalnota / qntnota;
                    System.out.println("A média das notas é " + media);
                    break;
                }
                // 2) Crie um programa que imprima um arrays com Foreach.
                case 2: {
                    int[] numeros = new int[3];
                    for (int i : numeros) {
                        System.out.println(i);
                    }
                    int[] numeros2 = { 1, 2, 3, 4, 5 };
                    for (int j = 0; j < numeros2.length; j++) {
                        System.out.println(numeros2[j]);

                    }
                    break;
                }
                // 3) Crie um programa que leia 10 valores double e salve em um array, depois
                // imprima esses valores.
                case 3: {
                    double[] valores = new double[10];

                    for (int i = 0; i < 10; i++) {
                        System.out.print("Digite o valor " + (i + 1) + ": ");
                        valores[i] = sc.nextDouble();
                    }

                    System.out.println("Valores:");
                    for (double valor : valores) {
                        System.out.println(valor);
                    }
                    break;

                }
                // 4) Crie um programa que leia 10 valores int e salve em um array, depois
                // imprima se esses valores são pares ou ímpares.
                case 4: {
                    int[] valoresint = new int[10];

                    for (int i = 0; i < 10; i++) {
                        System.out.print("Digite o valor " + (i + 1) + " ");
                        valoresint[i] = sc.nextInt();
                    }
                    System.out.println("Valores:");
                    for (int valor : valoresint) {
                        System.out.println(valor + " é " + (valor % 2 == 0 ? "par" : "ímpar"));
                    }
                    break;

                }
                // 5)Crie um programa que possua uma collection que represente as 52 cartas do
                // baralho, imprima elas.
                case 5: {
                    ArrayList<String> cartas = new ArrayList<>();

                    String[] naipes = { "Espadas", "Copas", "Ouros", "Paus" };
                    String[] faces = { "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };

                    for (String naipe : naipes) {
                        for (String face : faces) {
                            cartas.add(face + " de " + naipe);
                        }
                    }

                    for (String carta : cartas) {
                        System.out.println(carta);
                    }

                    break;
                }
                //6) Crie um programa que una duas listas de inteiros.
                case 6: {
                    List<Integer> lista1 = new ArrayList<>();
                    List<Integer> lista2 = new ArrayList<>();


                    lista1.add(1);
                    lista1.add(2);
                    lista1.add(3);

        
                    lista2.add(4);
                    lista2.add(5);
                    lista2.add(6);

        
                List<Integer> listaUnida = new ArrayList<>();
                listaUnida.addAll(lista1);
                listaUnida.addAll(lista2);

        
                System.out.println("Lista Unida: " + listaUnida);
                break;
}
                //7) Crie um programa que simule a fila de atendimento de um banco
                case 7:{
                    Queue<String> filaAtendimento = new LinkedList<>();

                    System.out.println("Atendimento");
                    int opcao;
                    do {
                    System.out.println("\nEscolha uma opção:");
                    System.out.println("1 - Adicionar cliente à fila");
                    System.out.println("2 - Atender próximo cliente");
                    System.out.println("3 - Verificar tamanho da fila");
                    System.out.println("0 - Encerrar o atendimento");
                    opcao = sc.nextInt();

                    switch (opcao) {
                            case 1:
                            System.out.print("Digite o nome do cliente: ");
                            String nome = sc.next();
                            filaAtendimento.offer(nome);
                            System.out.println(nome + " foi adicionado à fila.");
                            break;

                            case 2:
                            if (!filaAtendimento.isEmpty()) {
                            String clienteAtendido = filaAtendimento.poll();
                            System.out.println("Atendendo o cliente: " + clienteAtendido);
                            } else {
                            System.out.println("A fila está vazia. Não há clientes para atender.");
                            }
                            break;

                            case 3:
                            System.out.println("Tamanho da fila de atendimento: " + filaAtendimento.size());
                            break;

                            case 0:
                            System.out.println("Encerrando o atendimento. Obrigado!");
                            break;

                            default:
                            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                            }

                
                        
                            } while (opcao != 0);
                        }
                //8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano.             
                case 8:{
                        double[] temperaturas = new double[12];
                        double somaTemperaturas = 0;

                        for (int i = 0; i < 12; i++) {
                        System.out.print("Digite a temperatura média do mês " + (i + 1) + ": ");
                        temperaturas[i] = sc.nextDouble();
                        somaTemperaturas += temperaturas[i];
        }

                        double temperaturaMediaAnual = somaTemperaturas / 12;

                        System.out.println("Temperatura média anual: " + temperaturaMediaAnual);
                        break;
                }
                //9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3.     
                case 9:{
                    String[] comida = {"Feijoada", "Buchada", "Lasagna", "Mocotó", "Sarapatel", "Dobradinha", "Tainha", "Costelão", "Marreco", "Vatapá"};
                    String[] bebida = {"Cerveja", "Cachaça", "Vinho", "Tequila", "Whisk", "Tubaína", "Vodka", "Champagne", "Steinhaeger", "Abisinto"};
                    String[] banquete = new String[20];

                    for (int i = 0; i < 10; i++) {
                    banquete[i * 2] = comida[i];
                    banquete[i * 2 + 1] = bebida[i];
                    }

                    System.out.println("Comida:");
                    for (String conteudo : comida) {
                    System.out.println(conteudo);
                    }

                    System.out.println("\nBebida:");
                    for (String conteudo : bebida) {
                    System.out.println(conteudo);
                    }

                    System.out.println("\nBanquete:");
                    for (String conteudo : banquete) {
                        System.out.println(conteudo);
                    }
                    break;
                }
                //10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.
                case 10:
                        final int totalValores = 20;
                        double[] valores = new double[totalValores];
            
            
                        for (int i = 0; i < totalValores; i++) {
                        System.out.print("Digite o valor " + (i + 1) + ": ");
                        valores[i] = sc.nextDouble();
                        }
            
            
                        double somaValores = 0;
                        for (double valor : valores) {
                        somaValores += valor;
                        }
                        double media = somaValores / totalValores;
            
                        System.out.println("Média dos valores: " + media);
                        System.out.println("Valores abaixo da média:");
            
            
                        for (double valor : valores) {
                        if (valor < media) {
                            System.out.println(valor);
                            }
            }
            break;
            //DESAFIO
            case 11:{
                
                    System.out.println("Responda às perguntas com 'true' para sim e 'false' para não:");
                    System.out.print("Telefonou a vítima? ");
                    boolean resposta1 = sc.nextBoolean();
            
                    System.out.print("Esteve no local do crime? ");
                    boolean resposta2 = sc.nextBoolean();
            
                    System.out.print("Mora perto da vítima? ");
                    boolean resposta3 = sc.nextBoolean();
            
                    System.out.print("Devia para a vítima? ");
                    boolean resposta4 = sc.nextBoolean();
            
                    System.out.print("Já trabalhou com a vítima? ");
                    boolean resposta5 = sc.nextBoolean();
            
                    int pontos = 0;
            
                    if (resposta1) {
                        pontos++;
                    }
                    if (resposta2) {
                        pontos++;
                    }
                    if (resposta3) {
                        pontos++;
                    }
                    if (resposta4) {
                        pontos++;
                    }
                    if (resposta5) {
                        pontos++;
                    }
            
                    System.out.print("Classificação da pessoa: ");
                    if (pontos == 0 || pontos == 1) {
                        System.out.println("Inocente");
                    } else if (pontos == 2) {
                        System.out.println("Suspeita");
                    } else if (pontos >= 3 && pontos <= 4) {
                        System.out.println("Cúmplice");
                    } else {
                        System.out.println("Assassino");
                    }
                }
            }
        } while (choose != 0);

        sc.close();
    }
}

