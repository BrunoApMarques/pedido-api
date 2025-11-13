📦 pedido-api – API de Gerenciamento de Pedidos (Java + Spring Boot)

🚀 Tecnologias Utilizadas
Tecnologia	Descrição
☕ Java 17+	Linguagem principal
🍃 Spring Boot	Framework para criação da API
📦 Maven	Gerenciador de dependências
🧪 JUnit / Mockito	Testes automatizados
🐙 Git & GitHub	Versionamento
🏗 Arquitetura MVC	Organização das camadas


📁 Estrutura do Projeto
src/main/java/com/bruno/pedido/api
 ├── controller     # Endpoints REST
 ├── model          # Entidade Pedido
 ├── repository     # Interface PedidoRepository
 └── service        # Regras de negócio

📌 Endpoints da API

Todos os endpoints seguem o padrão REST e retornam JSON.

🔎 1. Listar todos os pedidos

GET /pedidos

Resposta:


[
  {
    "id": 1,
    "descricao": "Notebook Lenovo",
    "valor": 4200.00
  },
  {
    "id": 2,
    "descricao": "Mouse Gamer",
    "valor": 199.90
  }
]


🔎 2. Buscar pedido por ID

GET /pedidos/{id}

Resposta:


{
  "id": 1,
  "descricao": "Notebook Lenovo",
  "valor": 4200.00
}

🆕 3. Criar pedido

POST /pedidos

Body:


{
  "descricao": "Teclado Mecânico",
  "valor": 350.00
}


Resposta HTTP 201:


{
  "id": 3,
  "descricao": "Teclado Mecânico",
  "valor": 350.00
}

🔄 4. Atualizar pedido

PUT /pedidos/{id}

Body:


{
  "descricao": "Teclado Mecânico RGB",
  "valor": 420.00
}

❌ 5. Deletar pedido

DELETE /pedidos/{id}

Resposta HTTP 204: No content

🛠 Como rodar o projeto localmente
1️⃣ Clonar o repositório
git clone https://github.com/BrunoApMarques/pedido-api.git
cd pedido-api

2️⃣ Executar com Maven
mvn spring-boot:run

3️⃣ Acessar a API
http://localhost:8080/pedidos

🧪 Testes Automatizados

Os testes utilizam:

✔ JUnit 5
✔ Mockito
✔ Testes unitários da camada Service e Controller

📈 Pipeline de CI (GitHub Actions)

Badge ilustrativa (podemos ativar o workflow depois):

🗺 Roadmap (Próximos passos)

Adicionar banco H2

Criar DTOs para validação

Adicionar Swagger/OpenAPI

Criar Dockerfile

Melhorar testes

Implementar tratativa global de exceções

👨‍💻 Autor

Bruno Marques
Desenvolvedor Back-end Java | Spring Boot | APIs REST
🔗 GitHub: https://github.com/BrunoApMarques
