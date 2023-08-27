#include <stdio.h>

#include <stdlib.h>

 

 

int main()

{

	

 

int *p = (int*) malloc(1*sizeof(int));

 

if(p==NULL)

 

 

{

	

	printf("Error");

}

 

*p=50;

 

 

 

printf("Pointer Value %d\n\n\n"  , *p );

 

 

free(p);

return(0);
}

