CREATE TABLE topicos(

    id bigint not null auto_increment,
    titulo varchar(255) not null,
    mensagem text not null,
    autor varchar(100) not null,
    curso varchar(100) not null,
    data date not null,
    estado_topico tinyint not null,

    primary key(id),
    unique key(titulo, mensagem(255))

);