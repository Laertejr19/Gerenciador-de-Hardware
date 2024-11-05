Create database GerenciadorHardware;

use GerenciadorHardware;

CREATE TABLE usuarios (
id_usuario INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL UNIQUE,
senha VARCHAR(100) NOT NULL,
login varchar (100) not null unique,
perfil ENUM('tecnico', 'administrador', 'professor', 'estagiario') NOT NULL default 'estagiario'
);

SELECT * FROM usuarios;

CREATE TABLE laboratorios (
id_laboratorio INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL
);


SELECT * FROM laboratorios;

CREATE TABLE equipamento (
id_equipamento INT AUTO_INCREMENT PRIMARY KEY,
id_laboratorio INT,
nome VARCHAR(100) NOT NULL,
processador VARCHAR(100),
memoria_RAM VARCHAR(50),
armazenamento VARCHAR(50),
numero_serie VARCHAR(100) UNIQUE,
data_aquisicao DATE,
status ENUM('funcionando', 'em_manutencao', 'fora_de_uso') NOT NULL,
FOREIGN KEY (id_laboratorio) REFERENCES laboratorios(id_laboratorio)
);


SELECT * FROM equipamento;

CREATE TABLE manutencao (
id_manutencao INT AUTO_INCREMENT PRIMARY KEY,
id_equipamento INT,
data_manutencao DATE NOT NULL,
diagnostico TEXT,
solucao TEXT,
tecnico_responsavel VARCHAR(100),
FOREIGN KEY (id_equipamento) REFERENCES equipamento(id_equipamento)
);


SELECT * FROM manutencao;

CREATE TABLE pecas (
id_peca INT AUTO_INCREMENT PRIMARY KEY,
nome_peca VARCHAR(100) NOT NULL,
quantidade_estoque INT DEFAULT 0,
descricao TEXT
);


SELECT * FROM pecas;



CREATE TABLE pecas_manutencao (
id_peca_manutencao INT AUTO_INCREMENT PRIMARY KEY,
id_manutencao INT,
id_peca INT,
quantidade_utilizada INT NOT NULL default 0,
FOREIGN KEY (id_manutencao) REFERENCES manutencao(id_manutencao),
FOREIGN KEY (id_peca) REFERENCES pecas(id_peca)
);


SELECT * FROM pecas_manutencao;
