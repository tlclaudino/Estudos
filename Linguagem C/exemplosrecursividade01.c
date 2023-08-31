#include <stdio.h>

int somaRecursiva(int n) {
    if (n == 0) {
        return 0;
    } else {
        return n + somaRecursiva(n - 1);
    }
}

int main() {
    int num = 4;
    int resultado = somaRecursiva(num);
    printf("A soma dos números de 1 a %d é: %d\n", num, resultado);
    return 0;
}
//os exemplos são bem simples para ilustrar o conceito de recursividade. A contagem regressiva em C++ e a soma de números em C demonstram como uma função pode chamar a si mesma repetidamente para atingir um objetivo ou resolver um problema. Lembre-se de que a recursão deve sempre ter casos base bem definidos para evitar loops infinitos.




