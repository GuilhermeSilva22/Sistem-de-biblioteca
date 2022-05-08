
create table alunos(
id int not null auto_increment,
nome varchar (30) not null,
cpf varchar(11) not null unique,
email varchar(30) not Null,
telefone varchar(11) not Null,
turno varchar (8) not null,
primary key (id)
)default charset = utf8;