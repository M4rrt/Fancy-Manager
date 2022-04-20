create database Atividade_projeto_estoque
go
use Atividade_projeto_estoque
go
create table Produto(
  codigo_produto int identity primary key,
  Preco_produto money not null,
  QUantidade int not null,
  Nome_produto varchar(120)not null,
  Descricao_Produto varchar(1000) null

)
select* from Produto
insert into Produto(Preco_produto,QUantidade,Nome_produto,Descricao_Produto)
values             (10.5,10,'blusa de time','diversas blusa de time') 