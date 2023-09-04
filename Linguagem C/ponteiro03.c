#include <stdio.h>

int main(void) {

struct horario{
        int hora;
        int minuto;
        int segundo;
};
struct horario agora, *depois;
depois = &agora;
(*depois).hora = 20; //o parenteses serve para identificar procedencia, ou seja reconhecer o ponteiro antes o "".hora"
depois->minuto = 20; // no exempro desta linha substutuimos o "parenteses ()" e o "ponto ." por essa "seta" formada por "traço -" e sinal de "maior >"
depois->segundo = 20;
printf("%i:%i:%i", agora.hora, agora.minuto, agora.segundo);

return 0;
}