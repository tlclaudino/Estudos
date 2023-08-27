
#include <stdio.h>

#include <stdlib.h>

#include <stdbool.h>

//Estrutura utilizada

struct Node

{

    int data;

    struct Node *next;

};

//Iniciar uma pilha

struct Node* initialize()

{

    return NULL;

};

// VERIFICR SE A PILHA ESTA VAZIA 

bool isEmpty(struct Node* top)

{

    return top==NULL;

};

// Adicionar elemento no topo da pilha

struct Node* push(struct Node* top, int value)

{

    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));


    if(newNode==NULL)

    {

     printf("Falha na alocação de memória. Não é possivele adicionar novos elementos");

     return top;

    }

    newNode->data=value;

    newNode->next=top;    

    return newNode; 

};

 

 

//verifica  o tamanho da pilha

int size(struct Node* top)

{

    int count = 0;

    struct Node* temp = top;

    while(temp!=NULL)

    {

        count++;

        temp=temp->next;

    }

  return count;    

}

// Obtem a estrutra no topo da pilha

int peek(struct Node* top)

{

    if(isEmpty(top))

    {

        printf("Pilha vazia! Não há elementos para mostrar. \n");

         exit(EXIT_FAILURE);    

    }

    return top->data;

}

// Remover do Topo

struct Node* pop(struct Node* top)

{

    if(isEmpty(top))

    {

        printf("Pilha vazia! Não há elementos para mostrar. \n");

        return top;

    }

    struct Node* temp = top;

    free(temp);

    return top;


}



//Função Principal

/// @brief 
void main()

{

    struct Node* stack=initialize();

    int choice, value;

    while(1)

    {

        printf("\n ====Menu=====");

        printf("\n ====1. Empilhar(Push)=====\n");

        printf("\n ====2. Desempilhar(Pop)=====\n");

        printf("\n ====3. Ver Topo (Peek)=====\n");

        printf("\n ====4. Ver Tamanho da Pilha=====\n");

        printf("=======5.Sair======\n");


        printf("Escolha uma opção");

        scanf("%d", &choice);


        switch(choice)

        {

            case 1:

            printf("Digite o valor a ser empilhado");

            scanf("%d",&value);

            stack=push(stack,value);

            break;

            case 2:

                if(!isEmpty(stack))

                {

                    stack=pop(stack);

                    printf("Valor desempilhado.\n");

                }

                else

                {

                    printf("Pilha Vazia! \n");

                }

                break;

            case 3:

                if(!isEmpty(stack))

                {

                    value = peek(stack);

                    printf("Valor no topo da pilha: %d\n", value);

                }

                else

                {

                    printf("Pilha vazia! \n");

                }

            break;


            case 4:

            printf("\n Tamanho da Pilha: %d\n",size(stack));

            break;

            case 5:

                    printf("Saindo do Programa. \n");

                    while(!isEmpty(stack))

                    {

                    stack = pop(stack);


                    }

                    exit(EXIT_SUCCESS);

                    default:

                    printf("Opção inválida!Tente novamente.\n");

            }

    }

    return 0;    

}