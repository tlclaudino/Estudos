#include <stdio.h>

int main(void) {
  
int x = 10;
int *ponteiro;
ponteiro = &x;

int y = 20;
*ponteiro = y;
  
printf("%i %i\n", x, y);


  return 0;
}