import java.util.ArrayList;
import java.util.Scanner;

public class Prova01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<String>(); // 0 - João
        ArrayList<String> conceitos = new ArrayList<String>(); // 0 - Conceito do João

        String[] listaConceitos = {"O", "B", "S", "I"};
        int[] quantidadeConceitos = new int[4];

        System.out.println("Controle de Conceitos");
        
        int opcao = 0;
        do {
            System.out.println("1 - Cadastrar Conceito de Aluno");
            System.out.println("2 - Listar Alunos e Conceitos");
            System.out.println("3 - Listar Quantidade de Conceitos");
            System.out.println("4 - Alunos com conceito (O)");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.next();
                    
                    System.out.println("Digite o conceito do aluno: ");
                    String conceito = sc.next();
                    boolean conceitoValido = false;
                    for(int i = 0; i < listaConceitos.length; i++) {
                        if (conceito.equals(listaConceitos[i])) {
                            alunos.add(nome);
                            conceitos.add(conceito);
                            quantidadeConceitos[i]++;
                            conceitoValido = true;
                        }
                    }

                    /*
                    for(String listaConceito : listaConceitos) {
                        if (conceito.equals(listaConceito)) {
                            alunos.add(nome);
                            conceitos.add(conceito);

                            
                            if (conceito.equals("O")) {
                                quantidadeConceitos[0]++;
                            } else if (conceito.equals("B")) {
                                quantidadeConceitos[1]++;
                            } else if (conceito.equals("S")) {
                                quantidadeConceitos[2]++;
                            } else if (conceito.equals("I")) {
                                quantidadeConceitos[3]++;
                            }
                            conceitoValido = true;
                        }
                    }
                    */
                    if (!conceitoValido) {
                        System.out.println("Conceito inválido!");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Alunos e Conceitos");
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println(
                            "Aluno: " + alunos.get(i)
                            + " Conceito: " + conceitos.get(i));
                    }
                    break;
                }
                case 3: {
                    for(int i = 0; i < listaConceitos.length; i++) {
                        System.out.println(
                            "Conceito: " + listaConceitos[i]
                            + " Quantidade: " + quantidadeConceitos[i]);
                    }
                    break;
                }
                case 4: {
                    for(int i = 0; i < alunos.size(); i++) {
                        if (conceitos.get(i).equals("O")) {
                            System.out.println("Aluno: " + alunos.get(i));
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Saindo do programa...");
                    break;
                }
                default: {
                    System.out.println("Operação inválida");
                    break;
                }
            } 
        } while (opcao != 5);

        sc.close();

    }
}