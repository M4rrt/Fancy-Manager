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
  exec STPinserirproduto 25.00,8,'Bermuda Masculina','Bermuda Masculina Azul' 
  
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

INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (2, 15.00,6 ,'short Sport Masculina ', 'short Sport Masculina na cor Azul ');
	
INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (3, 15.00, 6, 'camiseta Basica  Masculina', 'camisetas Basicas nas cores minimalista');
	
INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (4,15.00,15,'Camiseta NY Masculina ', 'Camiseta NY Masculina De cores Azul,Amarela E Branca ');
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (5,15.00,2,'Camiseta Indio Masculina','tamanho p e cores Branca e vermelho');
	
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (6, 15.00,4, 'camiseta regata Masculino ', 'tamanho GG da cor Amarela');
	
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (7,20.00,2,'Camiseta Primavera Masculina ','do tamnho gg cor minimalista');
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (8, 45.00,6,'Calça Jeans Masculina', 'tamanhos  34,46,56 ');
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (9, 30.00, 4, 'Blusa polo Basica Masculina', 'diversos tamanho e cores');
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (10, 34.00, 8, 'Blusa Polo', 'diversos tamanho e cores');
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (11, 6.90, 7, 'Cueca BOX ', 'Tamanho P  Tecido Algodão');
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (12,6.90,1,'Cueca Box ', 'Tamanho P Microfibra');
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (13, 6.90, 4, 'Blusa polo Basica Masculina', 'diversos tamanho e cores');
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (14, 6.90, 8, 'Cueca Box ', 'Tamanho M Tecido Algodão');
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (15, 6.90, 3, 'Cueca Box', 'Tamanho G Tecido Algodão');
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (16,4.90 , 3, ' Cueca Infantil', 'Tamanho M , Tecido De algodão  ');
	
	INSERT INTO public.product(
	codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (17, 30.00, 2,'Cueca Infantil', ' Tamanho G  Tecido Algodão ');
	
	select * from  product