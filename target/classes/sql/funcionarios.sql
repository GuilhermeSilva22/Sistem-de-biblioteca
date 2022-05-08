create table livros(
id int not null auto_increment,
titulo varchar(30) not null,
quantidade int(200) not null,
estante varchar(2) not null,
prateleira varchar(2) not null,
primary key (id)
)default charset = utf8;

