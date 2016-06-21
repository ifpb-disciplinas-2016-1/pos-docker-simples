## Exemplo simples com o Docker

Este projeto descreve uma estrutura simples de acesso ao banco de dados.
São necessárias duas `docker images`, uma para o banco de dados e outra à aplicação.

### comandos

* Compilar o projeto: `mvn clean install`
* Na pasta exemplo-docker: `docker build -t app .`
* Na pastar exemplo-docker/postgres: `docker build -t banco .`
* Executar o container do banco: `docker run -p 5432:5432 -d banco`
* Executar o container da apliação: `docker run -p 8080:8080 -d app`

