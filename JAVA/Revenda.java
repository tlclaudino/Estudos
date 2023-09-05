import java.util.ArrayList;
import java.util.Scanner;

public class Revenda { //Introdução de Orientação ao Objeto
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<Carro>();
        int opcao = 0;
        do {
            System.out.println("Digite a placa do carro");
            String placa = sc.next();
            System.out.println("Digite o modelo do carro");
            String modelo = sc.next();
            Carro objetoCarro = new Carro(placa, modelo);

            carros.add(objetoCarro);
            System.out.println("Digite 0 para sair.....");
            opcao = sc.nextInt();
        } while (opcao != 0);

        for (Carro carro : carros) {
            System.out.println(carro.placa + " - " + carro.modelo);
        }

        sc.close();
    }
}
