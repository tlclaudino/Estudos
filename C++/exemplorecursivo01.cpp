#include <iostream>

int potencia(int base, int expoente) {
    if (expoente == 0) {
        return 1;
    } else {
        return base * potencia(base, expoente - 1);
    }
}

int main() {
    int base = 2;
    int expoente = 3;
    int resultado = potencia(base, expoente);
    std::cout << base << " elevado a " << expoente << " é: " << resultado << std::endl;
    return 0;
}