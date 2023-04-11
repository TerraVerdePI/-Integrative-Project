-- Criando o banco de dados e-commerce Terra Verde.
CREATE DATABASE db_terra_verde;

-- Conectando com o banco de dados db_terra_verde:
USE db_terra_verde;

-- Criando tabela categorias:
CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT PRIMARY KEY, -- chave primária
    categorias VARCHAR (255)
);

-- Criando tabela usuário:
CREATE TABLE tb_usuario(
	id BIGINT AUTO_INCREMENT PRIMARY KEY, -- chave primária
    usuario VARCHAR (255),
    senha VARCHAR (255),
    nome VARCHAR (255),
    foto VARCHAR (255),
    data_nascimento DATE,
    cpf VARCHAR (255),
    cnpj VARCHAR (255),
    cep VARCHAR (255),
    endereco VARCHAR (255),
    status_eco VARCHAR(255)
);

-- Criando tabela Produtos:
CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT PRIMARY KEY, -- chave primaria
    categorias_id BIGINT, -- Declarando o campo para a Foreign Key da table categorias
    usuario_id BIGINT, -- Declarando o campo para a Foreign Key da table usuario
    nome VARCHAR (255),
    descricao VARCHAR (255),
    quantidade VARCHAR (255),
    foto VARCHAR (255),
    preco DECIMAL (8,2),
    validade DATE,
    fornecedor VARCHAR (255),
    regiao VARCHAR (255),
    unidade_de_medida VARCHAR (255),
    
    FOREIGN KEY (categorias_id) REFERENCES tb_categorias(id),  -- Declarando a Foreign Key e de onde ela vem que nesse caso é da tabela categorias.
    FOREIGN KEY (usuario_id) REFERENCES tb_usuario(id)  -- Declarando a Foreign Key e de onde ela vem que nesse caso é da tabela usuario.
);

