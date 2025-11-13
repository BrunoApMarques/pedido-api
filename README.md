📦 pedido-api — API de Gerenciamento de Pedidos (Java + Spring Boot)








API REST desenvolvida com Java Spring Boot para gerenciamento de pedidos.
Projeto criado com foco em boas práticas, arquitetura limpa, separação de camadas e código preparado para expansão.

Ideal para estudos, demonstrações profissionais e práticas de mercado.

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

2️⃣ Buscar pedido por ID

GET /pedidos/{id}

Exemplo de resposta:

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

2. Executar com Maven
mvn spring-boot:run


Ou rodar pela IDE (IntelliJ/Eclipse) usando a classe principal.

3. Acessar os endpoints
http://localhost:8080/pedidos

📚 Futuras evoluções (roadmap)

Implementar banco H2

Criar validações com Bean Validation

Adicionar testes automatizados

Documentação Swagger/OpenAPI

Criar DTOs específicos

Preparar para Docker

👨‍💻 Autor

Bruno Marques
Desenvolvedor Back-end Java | Spring Boot | APIs REST
GitHub: https://github.com/BrunoApMarques
