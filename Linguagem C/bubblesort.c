#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void bubbleSort(int arr[], int n, int *comparacoes, int *trocas) {
    int i, j;
    for (i = 0; i < n-1; i++) {
        // Flag para verificar se houve trocas nesta passagem
        int trocou = 0;

        // Últimos i elementos já estão ordenados, então não precisamos compará-los novamente
        for (j = 0; j < n-i-1; j++) {
            (*comparacoes)++;  // Incrementa o contador de comparações

            if (arr[j] > arr[j+1]) {
                // Troca arr[j] e arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                (*trocas)++;  // Incrementa o contador de trocas
                trocou = 1;
            }
        }

        // Se não houve trocas nesta passagem, o vetor já está ordenado
        if (!trocou) {
            break;
        }
    }
}

int main() {
    int lista[100];
    int n = sizeof(lista) / sizeof(lista[0]);

    // Preencha a lista com números inteiros aleatórios
    srand(time(NULL));
    printf("Elementos da lista desordenados:\n");
    for (int i = 0; i < n; i++) {
        lista[i] = rand() % 100;  // Números inteiros aleatórios entre 0 e 9999
        printf("%d ", lista[i]);
    }
    printf("\n");

    int comparacoes = 0;
    int trocas = 0;

    bubbleSort(lista, n, &comparacoes, &trocas);

    printf("Elementos da lista ordenados:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", lista[i]);
    }
    printf("\n");

    printf("Número de comparações: %d\n", comparacoes);
    printf("Número de trocas: %d\n", trocas);

    return 0;
}