CREATE TABLE produto (

    id_produto serial not null primary key,
    nome varchar(50) not null,
    descricao varchar (300),
    preco numeric (18, 2)

);