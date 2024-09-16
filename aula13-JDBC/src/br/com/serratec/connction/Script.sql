create table cliente (codigo serial primary key.
	nome varchar(60) not null, telefone varchar(11),
	email varchar(30) not null unique);
	
insert into cliente (nome, telefone, email) values
("ana", 2634902934, "ana@gmail.com");	