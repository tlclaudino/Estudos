CREATE DATABASE SistemaVenda;
USE SistemaVenda;
/*
Primeira Tabela
*/
CREATE TABLE SistemaVenda.VENDEDOR (
nro_vend INT unsigned NOT NULL auto_increment, /* tipo inteiro, unsigned numeros positivos apenas, náo nulo, auto incrementado*/
nome_vend VARCHAR(50) NOT NULL, -- 50 caracteres e não nulo
idade_vend TINYINT UNSIGNED NULL, #int pequeno e nulo 

PRIMARY KEY(nro_vend)

);

CREATE TABLE SistemaVenda.cliente (
nro_cliente INT unsigned NOT NULL auto_increment, /* tipo inteiro, unsigned numeros positivos apenas, náo nulo, auto incrementado*/
nome_cliente VARCHAR(50) NOT NULL, -- 50 caracteres e não nulo
endereco VARCHAR(50) NULL,
complemento VARCHAR(50) NULL,


PRIMARY KEY(nro_cliente)

);

CREATE TABLE sistemavenda.venda(
nro_venda INT UNSIGNED NOT NULL auto_increment, 
vendedor_nro_vend INT UNSIGNED NOT NULL,
cliente_nro_cliente INT UNSIGNED NOT NULL,
data_venda DATETIME NOT NULL DEFAULT current_timestamp, -- defaut current_times
PRIMARY KEY(nro_venda),
FOREIGN KEY(vendedor_nro_vend) REFERENCES sistemavenda.vendedor(nro_vend),
FOREIGN KEY(cliente_nro_cliente) REFERENCES sistemavenda.cliente(nro_cliente)

 
)

