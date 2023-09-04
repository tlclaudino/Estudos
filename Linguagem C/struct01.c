#include <stdio.h>

int main(void) {
//definição de uma estrutura. definir struct
struct horario{
    int horas;
    int minutos;
    int segundos;
};
//declaração de uma estrutura
struct horario agora;// definido uma estrutura "agora" do tipo "horario"
//inicialização dos membros das variáveis da estrutura
agora.horas = 15;// para acessar os membros das variaveis da estrutura ou inserir valores "nomedaestrutura" + "ponto ." + "nomedavariavel"
agora.minutos = 17;
agora.segundos = 30;

printf("%i : %i : %i", agora.horas, agora.minutos, agora.segundos);
return 0;
}