create database bd_garagens;

USE bd_garagens;

create table usuarios (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
email  VARCHAR(100) NOT NULL,
senha VARCHAR(100) NOT NULL
);

CREATE TABLE garagens (
id  INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
pais VARCHAR(50),
estado VARCHAR(50),
cidade VARCHAR(50),
bairro VARCHAR(50),
rua VARCHAR(100),
numero VARCHAR(10),
cep VARCHAR(20)
);

INSERT INTO usuarios (nome, email, senha)
VALUES ('Carlos', 'carlos@gmail', '1234');
