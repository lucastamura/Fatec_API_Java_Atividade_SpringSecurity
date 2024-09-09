# Atividade Prática com Spring Security

## Descrição
Esta é uma aplicação REST construída utilizando Spring Boot, que realiza operações CRUD em uma entidade no banco de dados e utiliza Spring Security como camada de segurança.

## Etapas da resolução da atividade
1. Clone do repositório tamplate:
    ```bash
    git clone https://github.com/marcoweb/simple-spring-template.git
    ```
2. Inicialização do projeto:
    ```bash
   gradle build
    ```

3. Crie uma pasta chamada 'model' na raiz 
    ```
    app/src/main/java/application
    ```

4. Crie os atributos nome, categoria, e duração para o modelo de filmes. Após clique com o botão direito > "Searce actions" > "Generate get and set".

5. Crie o model "Usuario" importando as mesmas bibliotecas anteriores. Crie os atributos nomeDeUsuario e senha e gere os get and set.

6. Crie uma pasta chamada 'repository' na raiz 
    ```
    app/src/main/java/application
    ```

7. Crie os repositórios dos Filmes e dos Usuarios.

8. Na pasta 'controller', crie o arquivo FilmeController.java e defina os métodos GET, POST, PACTH e DELETE.






3. Criando contollers. A API será criada com base em um repositório de filmes.



3. Configure o banco de dados no arquivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    ```
4. Execute a aplicação:
    ```bash
    ./mvnw spring-boot:run
    ```

## Endpoints
A aplicação possui os seguintes endpoints:
- `GET /entidade` - Lista todas as entidades
- `GET /entidade/{id}` - Retorna uma entidade específica
- `POST /entidade` - Cria uma nova entidade
- `PUT /entidade/{id}` - Atualiza uma entidade existente
- `DELETE /entidade/{id}` - Deleta uma entidade

## Segurança
A aplicação utiliza Spring Security para autenticação e autorização. Para acessar os endpoints, é necessário estar autenticado.

## Modelo de Projeto
Este projeto foi baseado no modelo disponível em simple-spring-template.

## URL do GitHub
Anexe aqui a URL do repositório GitHub da aplicação criada.

## Prazo
Esta atividade deve ser entregue até **amanhã às 23:59**.
