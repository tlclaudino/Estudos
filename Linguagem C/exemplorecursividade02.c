#include <stdio.h>

void imprimirDecrescente(int n) {
    if (n > 0) {
        printf("%d ", n);
        imprimirDecrescente(n - 1);
    }
}

int main() {
    int num = 5;
    printf("Números decrescentes de %d até 1: ", num);
    imprimirDecrescente(num);
    printf("\n");
    return 0;
}




