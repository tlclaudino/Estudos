#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>

struct Cliente {
    char nome[50];
    char senha[10];
};

struct Node {
    struct Cliente data;
    struct Node* next;
};

struct Node* initialize() {
    return NULL;
}

bool isEmpty(struct Node* front) {
    return front == NULL;
}

struct Node* enqueue(struct Node* rear, struct Cliente cliente) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));

    if (newNode == NULL) {
        printf("Falha na alocação de memória. Não é possível adicionar novos elementos.\n");
        return rear;
    }

    newNode->data = cliente;
    newNode->next = NULL;

    if (rear == NULL) {
        return newNode;
    } else {
        rear->next = newNode;
        return newNode;
    }
}

struct Node* dequeue(struct Node* front) {
    if (isEmpty(front)) {
        printf("Fila vazia! Não há elementos para remover.\n");
        return front;
    }

    struct Node* temp = front;
    front = front->next;
    free(temp);

    return front;
}

int size(struct Node* front) {
    int count = 0;
    struct Node* temp = front;

    while (temp != NULL) {
        count++;
        temp = temp->next;
    }

    return count;
}

void printQueue(struct Node* front) {
    if (isEmpty(front)) {
        printf("Fila vazia! Nenhum cliente na fila.\n");
        return;
    }

    int position = 1;
    struct Node* temp = front;

    printf("Posição\tNome\tSenha\n");
    while (temp != NULL) {
        printf("%d\t%s\t%s\n", position, temp->data.nome, temp->data.senha);
        position++;
        temp = temp->next;
    }
}

int main() {
    srand(time(NULL));

    struct Node* front = initialize();
    struct Node* rear = initialize();

    int choice;
    struct Cliente novoCliente;

    while (1) {
        printf("\n ====Menu=====\n");
        printf("1. Adicionar cliente na fila\n");
        printf("2. Chamar próximo cliente\n");
        printf("3. Mostrar fila de espera\n");
        printf("4. Sair\n");
        printf("Escolha uma opção: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                if (rear == NULL || size(front) < 10) {
                    printf("Digite o nome do cliente: ");
                    scanf(" %[^\n]", novoCliente.nome);

                    snprintf(novoCliente.senha, sizeof(novoCliente.senha), "%04d", rand() % 10000);

                    rear = enqueue(rear, novoCliente);

                    if (front == NULL) {
                        front = rear;
                    }
                } else {
                    printf("A fila está cheia! Não é possível adicionar mais clientes.\n");
                }
                break;

            case 2:
                if (!isEmpty(front)) {
                    printf("Chamando cliente:\n");
                    printf("Nome: %s\nSenha: %s\n", front->data.nome, front->data.senha);
                    front = dequeue(front);
                } else {
                    printf("Não há clientes na fila para chamar.\n");
                }
                break;

            case 3:
                printf("Fila de espera:\n");
                printQueue(front);
                break;

            case 4:
                printf("Saindo do programa.\n");
                while (!isEmpty(front)) {
                    front = dequeue(front);
                }
                exit(EXIT_SUCCESS);

            default:
                printf("Opção inválida! Tente novamente.\n");
        }
    }

    return 0;
}