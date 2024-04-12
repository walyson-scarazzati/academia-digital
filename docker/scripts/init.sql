\c db_academia

CREATE TABLE tb_alunos (
    id SERIAL NOT NULL PRIMARY KEY,
    nome varchar(100) NOT NULL,
    cpf varchar(11),
    bairro varchar(50),
    dataDeNascimento date NOT NULL,
    ativo boolean NOT NULL
);

CREATE TABLE tb_avaliacoes (
    id SERIAL NOT NULL PRIMARY KEY,
    aluno_id integer,
    dataDaAvaliacao date NOT NULL,
    peso_atual numeric(5,2),
    altura_atual numeric(3,2)
);

CREATE TABLE tb_matriculas (
    id SERIAL NOT NULL PRIMARY KEY,
    aluno_id integer,
    dataMatricula date NOT NULL
);
