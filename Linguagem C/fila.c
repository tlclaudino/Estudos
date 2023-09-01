#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

// Estrutura para um nó na fila
struct Node {
    int data;
    struct Node* next;
};

// Estrutura para a fila
struct Queue {
    struct Node* front;
    struct Node* rear;
};

// Função para inicializar uma fila vazia
struct Queue* initialize() {
    struct Queue* q = (struct Queue*) malloc(sizeof(struct Queue));
    q->front = q->rear = NULL;
    return q;
}

// Função para verificar se a fila está vazia
bool isEmpty(struct Queue* q) {
    return q->front == NULL;
}

// Função para adicionar um elemento ao final da fila (enqueue)
void enqueue(struct Queue* q, int value) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Falha na alocação de memória. Não é possível adicionar mais elementos.\n");
        return;
    }
    newNode->data = value;
    newNode->next = NULL;
    if (isEmpty(q)) {
        q->front = q->rear = newNode;
    } else {
        q->rear->next = newNode;
        q->rear = newNode;
    }
}

// Função para remover o elemento da frente da fila (dequeue)
void dequeue(struct Queue* q) {
    if (isEmpty(q)) {
        printf("Fila vazia! Não é possível remover elementos.\n");
        return;
    }
    struct Node* temp = q->front;
    q->front = q->front->next;
    free(temp);
    if (q->front == NULL) {
        q->rear = NULL;
    }
}

// Função para obter o elemento da frente da fila sem removê-lo (peek)
int peek(struct Queue* q) {
    if (isEmpty(q)) {
        printf("Fila vazia! Não há elementos para mostrar.\n");
        exit(EXIT_FAILURE);
    }
    return q->front->data;
}

// Função para imprimir todos os elementos da fila
void printQueue(struct Queue* q) {
    if (isEmpty(q)) {
        printf("Fila vazia!\n");
        return;
    }
    struct Node* temp = q->front;
    printf("Fila: ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

// Função principal
int main() {
    struct Queue* queue = initialize();
    int choice, value;

    while (1) {
        printf("MENU:\n");
        printf("1. Enfileirar (Enqueue)\n");
        printf("2. Desenfileirar (Dequeue)\n");
        printf("3. Ver frente (Peek)\n");
        printf("4. Imprimir Fila\n");
        printf("5. Sair\n");
        printf("Escolha uma opção: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Digite o valor a ser enfileirado: ");
                scanf("%d", &value);
                enqueue(queue, value);
                break;

            case 2:
                if (!isEmpty(queue)) {
                    dequeue(queue);
                    printf("Valor desenfileirado.\n");
                } else {
                    printf("Fila vazia!\n");
                }
                break;

            case 3:
                if (!isEmpty(queue)) {
                    value = peek(queue);
                    printf("Valor na frente da fila: %d\n", value);
                } else {
                    printf("Fila vazia!\n");
                }
                break;

            case 4:
                printQueue(queue);
                break;

            case 5:
                printf("Saindo do programa.\n");
                while (!isEmpty(queue)) {
                    dequeue(queue);
                }
                free(queue);
                exit(EXIT_SUCCESS);
                default:
                printf("Opção inválida! Tente novamente.\n");
        }
    }

    return 0;
}

