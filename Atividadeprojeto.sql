create database atividade_projeto_estoque
go
use atividade_projeto_estoque
go
create table Produto(
  codigo_produto int identity primary key,
  preco_produto money not null,
  quantidade int not null,
  nome_produto varchar(50)not null,
  descricao_produto varchar(80) null

)
select* from Produto
insert into Produto(preco_produto,quantidade,nome_produto,descricao_produto)
values             (10.5,10,'blusa de time','diversas blusa de time')


