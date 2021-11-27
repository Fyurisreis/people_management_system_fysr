<h2>Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>

Fernando Yuri

Projeto desenvolvido para o Bootcamp Capgemini Fullstack Java and Angular.

<h3>Minhas alterações no projeto:</h3>

1. Criação da classe ProfessionDTO no pacote request;

2. Criação da classe Profession no pacote entities;

3. Criação do enum ProfessionType no pacote enums;

4. Adição de código no application.properties:
```
spring.datasource.url=jdbc:h2:mem:test;DB_CLOSE_DELAY=-1
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```
5. Modificações no JDBC URL do http://localhost:8080/h2-console:
```
jdbc:h2:mem:test
```

6. Deploy do projeto no Heroko:
```
https://people-management-system-fysr.herokuapp.com/api/v1/people
```

Foi utilizado o código fonte desenvolvido pelo especialista Rodrigo Peleias que construiu o projeto abordando os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados;
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema);
* Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto;
* Desenvolvimento de testes unitários para validação das funcionalidades;
* Implantação do sistema na nuvem através do Heroku.
