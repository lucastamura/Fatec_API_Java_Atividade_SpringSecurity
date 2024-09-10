# Atividade Prática com Spring Security

## Descrição
Esta é uma aplicação REST construída utilizando Spring Boot, que realiza operações CRUD em uma entidade no banco de dados e utiliza Spring Security como camada de segurança.

## Comandos uteis:
1. Realizar a compilação da aplicação:
    ```bash
    gradle build
    ```
2. Inicialização do container docker:
    ```bash
   docker compose up -d
    ```

3. Inicialização da aplicação:
    ```bash
   gradle bootRun
    ```

4. Acessar o MySQL dentro de um contêiner Docker:
    ```bash
   docker exec -it mysql mysql -u root -p
    ```

5. Definir uma variável de ambiente:
    ```bash
   export SECRET=987654321
    ```
4. Exibir o valor da variável de ambiente:
    ```bash
   echo $SECRET
    ```


### Sites uteis:

1. https://bcrypt-generator.com/#google_vignette