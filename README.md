# event-api

API escalável para gerenciar eventos e locais, construída com Java e princípios de Clean Architecture. O projeto tem foco em performance, código sustentável e integração com sistemas existentes.

## Funcionalidades

- **Cadastro de eventos**: Nome, descrição, data, local, etc.
- **Cadastro de locais**: Nome, capacidade, endereço.
- **Listagem, edição e exclusão de eventos e locais.**
- API pronta para integração com outros sistemas.
- Estrutura modular e fácil de manter.

## Endpoints

> **Observação:** Os exemplos abaixo são baseados em endpoints convencionais de APIs REST e podem variar conforme a implementação concreta do projeto.

### Eventos
- `GET /events` — Lista todos os eventos
- `POST /events` — Cria um novo evento
- `GET /events/{id}` — Detalha um evento
- `PUT /events/{id}` — Atualiza um evento
- `DELETE /events/{id}` — Remove um evento

### Locais
- `GET /venues` — Lista todos os locais
- `POST /venues` — Cria um novo local
- `GET /venues/{id}` — Detalha um local
- `PUT /venues/{id}` — Atualiza um local
- `DELETE /venues/{id}` — Remove um local

## Como rodar o projeto

### Pré-requisitos

- Java 17+ instalado
- Maven ou Gradle instalado

### Passos

1. Clone o repositório:
    ```sh
    git clone https://github.com/LeandroFonseca16/event-api.git
    cd event-api
    ```

2. Compile o projeto:
    ```sh
    ./mvnw clean install
    ```

3. Rode a aplicação:
    ```sh
    ./mvnw spring-boot:run
    ```
    ou
    ```sh
    java -jar target/event-api.jar
    ```

4. Acesse:
    - API: [http://localhost:8080](http://localhost:8080)
    - Utilize ferramentas como Postman ou Insomnia para testar os endpoints.

## Estrutura do Projeto

- `src/main/java` — Código-fonte da aplicação
- `src/test/java` — Testes automatizados
- Clean Architecture: separação clara das camadas de domínio, aplicação, infraestrutura e apresentação.

## Contribuição

1. Faça um fork do projeto
2. Crie um branch para sua feature (`git checkout -b feature/NovaFeature`)
3. Commit suas alterações (`git commit -am 'Adiciona nova feature'`)
4. Faça push (`git push origin feature/NovaFeature`)
5. Abra um Pull Request

## Licença

Esse projeto não possui licença definida.

---
Sinta-se à vontade para sugerir melhorias ou abrir issues!
