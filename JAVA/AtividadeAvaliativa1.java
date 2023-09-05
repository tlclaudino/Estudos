// ATIVIDADE AVALIATIVA 01 JAVA SENAC ADS 2º SEMESTRE JACKSON
/*
 * Instruções
Nos indicadores 1. Apresenta as particulares entre Programação Estruturada e Programação Orientada a Objetos, que tem como critério a Comparação, e 2. Utiliza coleções para manipulações de dados em uma linguagem de programação, que tem como critério a Relação, o objetivo é desenvolver a prática em Programação Orientada a Objetos, permitindo ao estudante aplicar uma linguagem de desenvolvimento orientado a objetos, de maneira a apresentar soluções de problemas no cotidiano.

Para analisar o aprendizado, desenvolva o algoritmo proposto, utilizando as estruturas de Array e Coleções propostas em sala de aula. O desenvolvimento deve conter:
* Comentários de Código demonstrando a estrutura
* Indentação de Código
* Utilização correta de Estruturas de Repetição
* Aplicação de camelCase e PascalCase para o código fonte
* Nomenclatura de variáveis que determinem sua utilização

Desenvolva um programa em Java que permita aos usuários realizar operações simples de manipulação de dados de alunos, utilizando estruturas de controle, tratamento de erros, vetores e coleções. O programa deve incluir os seguintes recursos:

* Crie um ou mais coleções de strings para armazenar os nomes de alunos e seus conceitos.
   * Os conceitos podem ser 'O', 'B', 'S' ou 'I'.
   * Caso seja criada mais de uma coleção, os nomes e os conceitos sempre devem corresponder no índice.
      * Exemplo: João está no índice 0 das coleções e seu conceito está no índice 0 das coleções.
   
* Crie um vetor de inteiros para armazenar a quantidade de cada conceito.
   * O vetor deve ter 4 posições, uma para cada conceito.
   * O vetor deve ser inicializado com 0 em todas as posições.
   * O vetor deve ser atualizado sempre que um novo conceito for inserido.

* Implemente um menu de opções numeradas que permita aos usuários:

   * Inserir um novo aluno e seu conceito.
   * Listar todos os alunos e seus conceitos.
   * Calcular e exibir a quantidade de cada conceito.
   * Exibir os alunos com o conceito mais alto.
   * Encerrar o programa.
 
Utilize estruturas de controle "if", "for" e "while" para realizar as operações de acordo com as escolhas dos usuários.

Implemente tratamento de erros para garantir que os conceitos inseridas sejam `char` válidos.
Meu trabalho
 *
 */

/* 
@author Thiago Claudino
@version 1.0
@since 2023-08-28 
*/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class AtividadeAvaliativa1 { //abre o corpo da classe
    public static void main(String[] args) { //abre o PSVM
        Scanner sc = new Scanner(System.in); //cria o objeto "sc" da classe "Scanner para inserir dados do usuário"
        int choose;
       
        ArrayList<String> alunoscadastrados = new ArrayList<>();//criado array para acumular os alunos cadastrados
        ArrayList<String> notascadastradas = new ArrayList<>();//criado array para acumular as notas cadastradas
        do { //abre o do/while
            System.out.println("Escolha as opções para registrar dados dos alunos");
            System.out.println(" 1 - Insira o Nome do Aluno");
            System.out.println(" 2 - Insira o Conceito do Aluno");
            System.out.println(" 3 - Mostrar todos os alunos cadastrados");
            System.out.println(" 4 - Mostrar todos os conceitos cadastrados");
            System.out.println(" 5 - Mostrar a quantidade de cada conceito");
            System.out.println(" 6 - Mostrar a relação aluno nota");
            System.out.println(" 0 - Sair");
            choose = sc.nextInt();
            switch (choose) { //abre o switch
                
                case 1:  //abre o case 1
                        
                        System.out.println("Digite o nome do Aluno");
                        String nome = sc.next();
                        alunoscadastrados.add(nome);//adicionar os alunos no array
                        System.out.println(nome + " foi adicionado ao cadastro.");
                        break;
                        //fecha o case 1 
                case 2: //abre case 2
                        
                        System.out.println("Digite o conceito do Aluno");
                        System.out.println("Escolha entre 'O'para Ótimo; 'B' para Bom; 'S' para Satisfatório e 'I' para Ignorante");
                        String nota = sc.next();
                        notascadastradas.add(nota);// adicionar as notas no array
                        System.out.println(nota + " foi adicionado ao cadastro.");
                        break;
                
                        //fecha case 2
                case 3: //abre case 3
                        System.out.println("Relação de alunos cadastrados");
                        for (String conteudo : alunoscadastrados) {//abre o for
                            System.out.println(conteudo);//imprimir lista dos cadastrados
                        }// fecha o for
                        
                        break;
                            //fecha case 3
                case 4://abre case 4
                        System.out.println("Relação de notas cadastradas");
                        for (String conteudo : notascadastradas) {//abre o for
                        System.out.println(conteudo); //imprimir notas cadastradas
                        }// fecha o for
                        break;
                        //fecha case 4
                case 5://abre case 5
                        System.out.println("Quantidade de notas de cada conceito");
                        for ( String conteudo : notascadastradas) {//abre o for
                        System.out.println(conteudo);
                        }// fecha o for
                        break;
                        //fecha case 5
                case 6://abre case 6
                        System.out.println("Relação Anulo/Nota");
                        for (String conteudo : notascadastradas){
                        System.out.println(conteudo);    
                        }//fecha o for     
                             
                        break;
                        //fecha case 6
    } //fecha o switch
        }while (choose !=0); //fecha o do/while
        
    } //fecha o PSVM
} //fecha o corpo da classe