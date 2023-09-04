#include <stdio.h>

int main(void) {
// em uma estrutura cabe variaveis de tipos diferentes
struct horario{
        int horas;
        int minutos;
        int segundos;
        double teste;
        char letra;
};
struct horario agora;
agora.horas = 15;
agora.minutos = 17;
agora.segundos = 30;

struct horario depois;
depois.horas = agora.horas + 10; //possivel fazer operações matematicas com variáveis de uma estrutura
depois.minutos = agora.minutos;//é possivel usar um membro de outra estrutura receber o valor de outro variável/membro de uma outra estrutura. no caso a "variável minutos" da estrutura "depois" esta recebendo o valor da "variavel minutos" da estrutura "agora"
depois.teste = 50.55/ 123;//este membro recebe uma operação matemática
depois.letra = 'a';// este membro esta recebendo um "caracter"


printf("%i\n", depois.horas);
printf("%i\n", depois.minutos);
printf("%f\n", depois.teste);
printf("%c\n", depois.letra);
printf("%i : %i : %i", agora.horas, agora.minutos, agora.segundos);

return 0;
}