📦 pedido-api

API REST desenvolvida em Java com Spring Boot para gerenciamento de pedidos.  
Projeto criado para estudo e demonstração de boas práticas de backend (controllers enxutos, service com regras de negócio e repository separado).

🚀 Tecnologias
 Java 17 (ou versão que estiver usando)
 Spring Boot
 Maven
 JUnit 5 e Mockito (testes)
 Docker (possível containerização)
 Git / GitHub

📁 Estrutura do projeto

src/main/java/com/bruno/pedido/api
 ├── controller     * endpoints REST (PedidoController)
 ├── model          * entidade Pedido
 ├── repository     * interface PedidoRepository
 └── service        * regras de negócio (PedidoService)
 
🔗 Endpoints principais
1. Listar pedidos

GET /pedidos
Retorna a lista de pedidos cadastrados.

2. Criar pedido

POST /pedidos
Exemplo de corpo:

{
  "descricao": "Compra de teclado",
  "valor": 120.00,
  "status": "PENDENTE"
}

3. Buscar pedido por ID

GET /pedidos/{id}

4. Atualizar pedido

PUT /pedidos/{id}

5. Excluir pedido

DELETE /pedidos/{id}

🧪 Testes

O projeto contém testes de serviço usando JUnit 5 e Mockito.
Exemplo de teste: PedidoServiceTest.deveCriarPedidoComSucesso(), validando:

montagem do cenário

chamada ao service

assert dos campos

verificação se o repository foi chamado

🏗️ Como rodar o projeto

1. clonar o repositório
git clone https://github.com/BrunoApMarques/pedido-api.git
cd pedido-api

2. rodar testes
mvn test

3. subir a aplicação
mvn spring-boot:run

A API ficará disponível em:
👉 http://localhost:8080

👤 Autor

Bruno Marques

Desenvolvedor Back-end

Campinas – SP

LinkedIn: https://linkedin.com/in/bruno-marques-pcd-7a15b8107

📌 Observação: projeto foi criado para praticar conceitos de APIs REST com Spring Boot, camadas separadas (controller → service → repository), testes automatizados e versionamento com Git.
