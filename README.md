🚀 Tecnologias utilizadas

Java 17+

Spring Boot (Web, Validation)

Maven

JUnit / Mockito

Git & GitHub

Arquitetura MVC (Controller → Service → Repository → Model)

🧱 Arquitetura do Projeto
src/main/java/com/bruno/pedido/api
 ├── controller     # Endpoints REST (PedidoController)
 ├── model          # Entidade Pedido
 ├── repository     # Interface PedidoRepository
 └── service        # Regras de negócio (PedidoService)


Princípios aplicados:

SOLID

Separação clara de responsabilidades

DTOs para comunicação (quando necessário)

Controllers enxutos

Services contendo regra de negócio

Repository para persistência (padrão Repository)

📌 Funcionalidades

✔ Listar pedidos
✔ Buscar pedido por ID
✔ Criar novo pedido
✔ Atualizar pedido existente
✔ Deletar pedido

🔗 Endpoints principais
1️⃣ Listar todos os pedidos

GET /pedidos
Retorna a lista completa de pedidos cadastrados.

2️⃣ Buscar pedido por ID

GET /pedidos/{id}

Response exemplo:

{
  "id": 1,
  "descricao": "Notebook Lenovo",
  "valor": 4200.0
}

3️⃣ Criar pedido

POST /pedidos
Body:

{
  "descricao": "Mouse Gamer",
  "valor": 199.90
}

4️⃣ Atualizar pedido

PUT /pedidos/{id}
Body:

{
  "descricao": "Mouse Gamer RGB",
  "valor": 249.90
}

5️⃣ Deletar pedido

DELETE /pedidos/{id}

🛠️ Como rodar o projeto localmente
1. Clonar o repositório
git clone https://github.com/BrunoApMarques/pedido-api.git
cd pedido-api

2. Rodar com Maven
mvn spring-boot:run


Ou pela IDE (IntelliJ/Eclipse), rodando a classe principal.

3. Acessar os endpoints
http://localhost:8080/pedidos

📚 Futuras evoluções (roadmap)

Implementar banco de dados H2

Criar validações com Bean Validation

Adicionar testes automatizados

Implementar Swagger/OpenAPI

Criar DTOs específicos para requests/responses

Preparar a API para Docker

👨‍💻 Autor

Bruno Marques
Desenvolvedor Back-end Java | Spring Boot | APIs REST
GitHub: https://github.com/BrunoApMarques

LinkedIn: https://linkedin.com/in/bruno-marques-pcd-7a15b8107

📌 Observação: projeto foi criado para praticar conceitos de APIs REST com Spring Boot, camadas separadas (controller → service → repository), testes automatizados e versionamento com Git.
