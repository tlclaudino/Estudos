#include<stdio.h>

#include<stdlib.h>

 

 

void main()


 

 

 

int vectorsizer=5;

int *vector = (int*)malloc(tvectorsize* sizeof(int));

 

if(vector==NULL)

{

	

	printf("Error");
    exit(1);
}

 

 

for(int i=0;i<vectorsize; i++)

{

   

   

   printf("Write value\n\n", i+1);

   scanf("%d", &vector[i]);

   

 

	

}

 

for(int i=0;i<vectorsize; i++)

{

	

    printf("pointer value e %d\n\n", vector[i] );	

	

}

 

free(vector);
return(0);