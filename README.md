# agenda-de-contatos
Esse App (Agenda de Contatos) foi criado com um menu principal: com login de acesso, criar usuário ou remover usuário. Um segundo menu com: Cadastro de Contato,Remover Contato, Listar Contato, Encontrar Contato pelo ID, Sair(voltar ao menu principal). Um Banco de Dados relacional PostgreSQL com o uso de JPA no java para poder ter acesso aos metodos Criar, Deletar, Listar, Atualizar. Aprendi a fazer o mapeamento da classe relacionada a tabela(@javax.persistence.Entity(name="contatos")) e no caso o metodo DELETE estava dando problemas, minha solução foi criar uma QUERY e ai então pegar o ID e dai fazer a remoção.
O banco de dados e tabelas foram criados da seguinte maneira:

CREATE DATABASE agendaContatos;

CREATE TABLE contatos (
	id INT PRIMARY KEY,
	nome_contato VARCHAR(100) NOT NULL,
	telefone_contato VARCHAR(80) NULL,
	telefone_tb_contato VARCHAR(80) NULL,
	email_contato VARCHAR(80) NOT NULL
);

CREATE TABLE usuarios (
	id INT PRIMARY KEY,
	nome_usuario VARCHAR(30) NOT NULL,
	email_usuario VARCHAR(30) NOT NULL,
	senha_usuario VARCHAR(100) NOT NULL	
);
