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
go 
--procedure para inserir produto
create procedure STPinserirproduto (
     @precoproduto money,
	 @quantidade int,
	 @nomeproduto varchar(50),
	 @descricaoproduto varchar (80)
)
as
begin 
    insert into Produto( preco_produto,quantidade,nome_produto,descricao_produto)
	values             (@precoproduto,@quantidade,@nomeproduto, @descricaoproduto)

  end
 
   

   --Testando se funciona

  exec STPinserirproduto 20.0,10,'blusa lv','Eu fiz um procedure'
  
-- criada para deletar produto
  SELECT *FROM Produto
create procedure DeleteProduto(
   @codigo_produto int
   )
  as 
  begin 
   delete Produto
    where @codigo_produto = codigo_produto
  end
  --Testando se funciona

  exec DeleteProduto  5
  

   

 
--Alterar Produto (Não consegui fazer uma unica procedure)
create procedure STPalterarproduto(
  @preco_produto money ,
  @quantidade int,
  @nome_produto varchar(50),
  @descriacaoproduto varchar(80),
  @codigoproduto int 
  )
  as 
  begin 
   update Produto
   set preco_produto=@preco_produto,
       quantidade=@quantidade,
	   nome_produto = @nome_produto,
	   descricao_produto = @descriacaoproduto
	   where codigo_produto = @codigoproduto
end
--Testando se funciona
exec STPalterarproduto 200.0, 100,'Blusa Brasil ','descricao',1

