#include <stdio.h>

 

#include <stdlib.h>

 

#include <string.h>

 

 

 

// Defina a struct para representar uma pagina web

 

struct Pagina

{

	char url[100];

	char titulo[100];

};


// Nó da pilha

 

struct No 

{

	struct Pagina pagina;

	struct No* proximo;

};

 

 

 

// Protótipos de função

 

struct No* push(struct No* topo, struct Pagina novaPagina) 

{

	struct No* novoNo = (struct No*) malloc(sizeof(struct No));

	novoNo->pagina = novaPagina;

	novoNo->proximo = topo;

	topo = novoNo;

    return topo;

 

}

 

struct Pagina peek(struct No* topo) 

{

	if (topo == NULL)

	{

		printf("Erro: pilha vazia.\n");

		exit(1);

	}

	return topo->pagina;

}

struct Pagina pop(struct No* topo);


 

// Implementação das funções

 

// ...

 

 

 

int main() 

{

	struct No* topo = NULL;

	struct Pagina pagina01;

	char titulo[100] = "UOL";

	char url[100] = "https://www.uol.com.br";

	strcpy(pagina01.titulo, titulo);

	strcpy(pagina01.url, url);


	//empilhar

	topo = push(topo, pagina01);

	peek(topo);

	struct Pagina pagina02;

	strcpy(pagina02.titulo, "TERRA");

	strcpy(pagina02.url, "https://www.terra.com.br");

 

	topo = push(topo, pagina02);

	struct Pagina mostrarPagina=peek(topo);

	printf("Topo: %s", mostrarPagina.titulo);

 

}