
# Fancy Manager

## O que é nosso projeto ?

	O projeto tem como objetivo auxiliar a empresa ![JPaixão Modas] (https://instagram.com/jpaixaomodas?igshid=YmMyMTA2M2Y=) no controle de estoque que é feito atualmente por meio de cadernos, o que além de ineficiente é altamente vulnerável a perdas e danos  por influências externas.
	Nosso projeto e feito em java  como o [SGBD postgreSQL](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads) Podendo  instalar  através do link acima. e também pelo [Netbeans](https://netbeans.apache.org/download/nb13/nb13.html), [JDK recomendado e o 18 ](https://www.oracle.com/java/technologies/downloads/#jdk18-windows) 
   
## Requisitos: 

 1. Instalação do postgreSQL 
 2. Ter o JDK no se computador Link acima  ,veja qual e seu Sistema operacional Linux,MacOs,Windows.  
 3. Fazer as adaptação necessaria para poder funcionar na usa maquina local caso necessário.
 4. O computador Com a configuração minima é   I3 4GB de ram e 256GB de HD 	

## Instalação: 

	Para utilizar o sistema, basta baixar o o banco de dados "bancoProjeto.sql" e o arquivo jar "fancyManager.jar" [Github](https://github.com/M4rrt/Fancy-Manager.git)

## Executando o programa:

	Para iniciar o programa, basta dar dois cliques no executavel "fancyManager.jar".
	Lista de comandos:

		Tela Principal - Essa tela é aberta logo após abrir o sistema. Nela é exibida uma tabela com os produtos cadastrados no estoque, e os botões para as ações de incluir, alterar, remover e consultar.

		-Tabela Produto: Nela é mostrada todos os produtos cadastrados no banco de dados;
		-Botão “Incluir”: Direciona o usuário para  a tela de cadastro ao clicar;
		-Botão “Remover”: Ao clicar direciona o usuário para a tela de exclusão de produtos;
		-Botão “Avisos”: Direciona para a tela de avisos, onde é mostrado todos os produtos que já atingiram o estoque de segurança;
		-Botão “Alterar”: O usuário seleciona um produto na tabela do menu principal e clica no botão “Alterar”, então ele  é direcionado a uma tela com os campos campos para alteração (nome, valor, quantidade, segurança e descrição), os botões “Limpar” e “Alterar” (Similar a tela de cadastro).
		-Botão “Limpar”: Apaga tudo que foi escrito nas caixas de texto;
		-Botão “Alterar”: Altera registra  a informação nos campos nome, valor, quantidade, segurança e descrição no banco de dados referentes ao código informado pelo usuário e mostra uma caixa de mensagem informando que a alteração foi concluída com sucesso;
			-Ao clicar no botão “OK”, a caixa de mensagem é fechada e o usuário é direcionado ao menu principal.
		-Campo de busca: Para filtrar os produtos na tabela de consulta, o usuário seleciona o atributo na combobox, informar o valor no campo de texto e clicar no botão “Buscar”. O sistema irá filtrar todos os produtos no banco de dados de acordo com o parâmetro informado pelo usuário.


		Tela “Cadastrar produto” - É acessada ao clicar no botão “Incluir” na tela principal:

		-Botão “Limpar”: Apaga tudo o que foi escrito nos campos nome, valor, quantidade, segurança e descrição;
		-Botão “Cadastrar”: Ao clicar registra  a informação nos campos nome, valor, quantidade, segurança e descrição no banco de dados e mostra uma caixa de mensagem informando que os dados foram incluídos no banco de dados.
			-Ao clicar no botão “OK”, a caixa de mensagem é fechada e o usuário é direcionado a tela de cadastro.



		Tela “Remover Produto” - É acessada ao clicar no botão “Remover” na tela principal:

		-Botão “Remover”: Consulta no banco de dados o produto cadastrado equivalente ao código e o nome informados e abre a caixa de mensagem para confirmação da exclusão;
		Na caixa de mensagem há dois botões. Ao clicar em “Remover”, o produto selecionado é excluído do banco de dados, é mostrado uma caixa de mensagem que a exclusão foi feita com sucesso e o usuário retorna a tela para remoção de produtos;
		Caso clique em “Cancelar”, o processo é desfeito e o usuário retorna a tela de remoção de produtos sem fazer qualquer alteração no banco de dados.
		-Botão “Menu Principal”: Retorna ao menu principal.


		Tela de Avisos - Caso algum produto tenha atingido o estoque de segurança, essa tela é aberta logo após ser feito o login no sistema. Pode ser acessada também ao clicar no botão “Avisos”, no menu principal. Nesta tela é são exibidos todos os produtos no banco de dados cujo a quantidade em estoque tenham atingido o estoque de segurança:
			-Botão “Menu Principal”: Retorna o usuário ao menu principal.

## Ajuda

	Qualquer duvida ou sugestão referente ao programa pode ser encaminhada para um dos e-mail dos desenvolvedores:
		-guilhermemartinszot@gmail.com
		-carlos.bissoni@mail.usf.edu.br
		-joaomartins19909@gmail.com
		-Jhonatan.machado@mail.usf.edu.br
		

## Autores

	Ra. 002202003072 – Guilherme Martins
	Ra. 002202006037 – Jhonatan Naves Machado
	Ra. 202107981 – Carlos Miguel Bissoni Ribeiro
	Ra. 202111001 – Francisco Leopoldino da Paixão Neto
	Ra. 202125222 – João Vitor da Silva Martins


## Historico de versão

	0.2 - Várias correções de bugs e otimizações
Veja a alteração do commit ou Veja o histórico de lançamentos
	0.1 - Lançamento inicial
	
## Licença

	O sistema é licenciado pela MIT License. Veja o arquivo LICENSE.md para mais detalhes.
	
	
## Agradecimentos

		Agradecemos a Universidade São Francisco e ao professor Jose Matia Lemes Filho pela oportunidade que nos possibilitou uma amostra da vivencia e da rotina em um projeto de um sistema.
	
