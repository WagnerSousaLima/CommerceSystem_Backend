<h1 align="center"> Projeto Web Services com Spring Boot e JPA / Hibernate

<br />
<br />

<p align="center">
  <img src="/banner1.png" alt="Banner Principal" width="500">
  <img src="/banner2.png" alt="Banner Principal 2" width="700">
</p>
</h1>

<br />

<h2 align="center"> 💻 Projeto </h2>

O sistema criado é uma aplicação de serviços web usando Spring Boot e JPA / Hibernate, onde os usuários podem gerenciar dados de forma eficiente. A aplicação inclui a gestão de usuários, produtos, pagamentos e pedidos, proporcionando um sistema completo para operações comerciais. Os usuários podem criar, atualizar, deletar e visualizar informações relacionadas a esses elementos, garantindo uma administração abrangente e organizada dos dados.

### 🛠️ Endpoints da API

Usuários:
- GET /users - Retorna a lista de todos os usuários
- GET /users/{id} - Retorna um usuário específico
- POST /users - Adiciona um novo usuário
- DELETE /users/{id} - Remove um usuário
- PUT /users/{id} - Atualiza um usuário existente

Pedidos:
- GET /orders - Retorna a lista de todos os pedidos
- GET /orders/{id} - Retorna um pedido específico

Categorias:
- GET /categories - Retorna a lista de todas as categorias
- GET /categories/{id} - Retorna uma categoria específica

Produtos:
- GET /products - Retorna a lista de todos os produtos
- GET /products/{id} - Retorna um produto específico

<h2 align="center"> 🚀 Tecnologias </h2>

Este projeto foi construído utilizando as seguintes tecnologias:

- Java para desenvolvimento da aplicação.
- Spring Boot para estruturação do backend.
- Spring Data JPA para persistência de dados.
- H2 Database para banco de dados em memória durante o desenvolvimento.
- Maven para gerenciamento de dependências e construção do projeto.
- Git e Github para controle de versão e hospedagem do código-fonte.

<h2 align="center"> 🛠️ Estrutura do Projeto </h2>

O projeto é estruturado com várias entidades principais, como User, Order, Category e Product. Utiliza Spring Boot para configuração e gestão do backend, e JPA / Hibernate para persistência de dados. O banco de dados H2 é utilizado no perfil de teste para facilitar o desenvolvimento.

A entidade User possui um recurso dedicado, com suporte completo para operações CRUD (criação, recuperação, atualização e deleção), além de tratamento de exceções para essas operações. O seeding do banco de dados é realizado automaticamente ao iniciar a aplicação, populando-o com dados de exemplo.

Os pedidos (Orders) são gerenciados com suporte a datas no padrão ISO 8601, e um enum OrderStatus é utilizado para representar os diferentes estados dos pedidos. A entidade OrderItem representa uma associação muitos-para-muitos com dados extras entre Product e OrderItem, e a entidade Payment tem uma associação um para um com Order.

As categorias (Categories) e produtos (Products) são gerenciados com CRUD completo, com associações muitos-para-muitos implementadas usando JoinTable. Métodos para cálculo de subtotal e total dos pedidos são fornecidos, garantindo uma gestão eficiente das operações financeiras.

O projeto inclui uma camada de tratamento de exceções para capturar e responder a erros de forma padronizada, usando controladores de exceções personalizados que retornam respostas apropriadas de acordo com o tipo de erro.
