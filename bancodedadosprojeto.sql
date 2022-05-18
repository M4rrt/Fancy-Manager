create table produto(
	codigo_produto int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  	preco_produto money NOT NULL,
  	quantidade int not null,
  	nome_produto varchar(50)not null,
  	descricao_produto varchar(80) null
)
INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES(34.00, 8, 'Blusa Polo', 'diversos tamanho e cores');
	INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	  VALUES (6.90, 7, 'Cueca BOX ', 'Tamanho P  Tecido Algodão');
	INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 VALUES(6.90,1,'Cueca Box ', 'Tamanho P Microfibra');
	INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (6.90, 4, 'Blusa polo Basica Masculina', 'diversos tamanho e cores');
	INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	VALUES (6.90, 8, 'Cueca Box ', 'Tamanho M Tecido Algodão');
	INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 VALUES (6.90, 3, 'Cueca Box', 'Tamanho G Tecido Algodão');
	INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 VALUES(4.90 , 3, ' Cueca Infantil', 'Tamanho M , Tecido De algodão');
	INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 VALUES(30.00, 2,'Cueca Infantil', ' Tamanho G  Tecido Algodão ');
	INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 VALUES ( 30.00, 2,'Cueca Infantil', ' Tamanho G  Tecido Algodão ');
	 ---
	 
	 INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 VALUES (15.00,6 ,'short Sport Masculina ', 'short Sport Masculina na cor Azul ');
	 INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 VALUES ( 15.00, 6, 'camiseta Basica  Masculina', 'camisetas Basicas nas cores minimalista');
INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 VALUES (15.00,2,'Camiseta Indio Masculina','tamanho p e cores Branca e vermelho');
	
	 INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 VALUES (15.00,15,'Camiseta NY Masculina ', 'Camiseta NY Masculina De cores Azul,Amarela E Branca ');
	 INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 VALUES (15.00,2,'Camiseta Indio Masculina','tamanho p e cores Branca e vermelho');
	 
	 	 INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 values (15.00,4, 'camiseta regata Masculino ', 'tamanho GG da cor Amarela');
	
	 	 INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	  values (15.00,4, 'camiseta regata Masculino ', 'tamanho GG da cor Minimalista');
	 	 INSERT INTO public.produto(
	 preco_produto, quantidade, nome_produto, descricao_produto)
	 VALUES (20.00,2,'Camiseta Primavera Masculina ','do tamnho gg cor minimalista');