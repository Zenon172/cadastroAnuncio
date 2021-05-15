# cadastroAnuncio
Sistema de Cadastro de anúncio para o desafio de programação da Academia Capgemini

Autor: Lincoln Silva de Oliveira
e-mail: legionario_172@hotmail.com

Para compilar e executar o sistema deve-se executar a Classe: src/aplicacao/Aplicaao.java
Ao executar o sistema será perguntado se deseja cadastrar um anúncio, caso sim serão solicitados os dados do anúncio em um loop emquanto o utilizador informar que não deseja mais cadastrar, neste momento será perguntado se deseja extrair algum relátório, caso a resposta seja sim será solicitado se deseja pesquisar por nome do cliente ou por um périodo de data inicial e final da campanha, após escolher um ou o outro e inserir a forma de pesquisa será gerado o relatório contendo os dados do anúncio e a quantidade de visualizações, cliques e compartilhamentos.
A classe src/entidaddes/Cadastro.java é o modelo que contém os atributos necessários para os anúncios e as funcões que calcula o valor do investimento total dado o valor do investimento diário multiplicado pelo intervalo de dia inicial da campanha e final, e a calculadora de vizualizações, cliques e  compartilhamentos.
