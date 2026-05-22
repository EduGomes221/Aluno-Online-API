# 🎓 Aluno Online API

![Java](https://img.shields.io/badge/Java-17-red?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.5-green?logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?logo=mysql)
![Maven](https://img.shields.io/badge/Maven-Build-orange?logo=apachemaven)
![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-success)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

---

# 📚 Sobre o Projeto

O **Aluno Online API** é uma aplicação back-end desenvolvida com **Spring Boot**, criada com o objetivo de simular um sistema acadêmico completo para gerenciamento de:

* 👨‍🎓 Alunos
* 👨‍🏫 Professores
* 📖 Disciplinas
* 🏫 Cursos
* 📝 Matrículas
* 📊 Histórico acadêmico

O projeto foi desenvolvido aplicando conceitos modernos de:

* APIs REST
* Arquitetura em camadas
* Modelagem de banco de dados
* DTOs
* JPA/Hibernate
* Validação de dados
* Organização profissional de projetos Spring Boot

---

# 🚀 Tecnologias Utilizadas

## 🔧 Back-End

* Java 17
* Spring Boot 3.2.5
* Spring Web
* Spring Data JPA
* Hibernate
* Maven

## 🗄 Banco de Dados

* MySQL

## 📦 Ferramentas

* IntelliJ IDEA
* Postman
* Git & GitHub

---

# 🏗 Arquitetura do Projeto

O projeto segue uma arquitetura em camadas utilizada em aplicações profissionais.

```bash
src/main/java/br/com/alunoonline/api
│
├── controller
├── service
├── repository
├── model
├── dtos
└── enums
```

## 📌 Responsabilidade de cada camada

### 🎮 Controller

Responsável por receber as requisições HTTP da API.

Exemplos:

* GET
* POST
* PUT
* DELETE

---

### ⚙️ Service

Responsável pelas regras de negócio da aplicação.

Exemplos:

* validações
* cálculos
* lógica acadêmica

---

### 🗄 Repository

Responsável pela comunicação com o banco de dados utilizando JPA.

---

### 📦 Model

Representa as entidades do sistema.

Exemplos:

* Aluno
* Professor
* Curso
* Disciplina
* Matrícula

---

### 📨 DTOs

Responsáveis pela transferência de dados entre cliente e servidor.

Utilizados para:

* segurança
* organização
* padronização das respostas

---

### 🏷 Enums

Responsáveis por valores fixos da aplicação.

Exemplo:

```java
public enum StatusMatricula {
    CURSANDO,
    APROVADO,
    REPROVADO
}
```

---

# 🧩 Funcionalidades Implementadas

## 👨‍🎓 Alunos

* Cadastro de alunos
* Atualização de dados
* Busca por ID
* Listagem de alunos
* Exclusão de alunos

---

## 👨‍🏫 Professores

* Cadastro de professores
* Atualização de dados
* Busca por ID
* Listagem
* Exclusão

---

## 📚 Cursos

* Cadastro de cursos
* Associação de disciplinas
* Controle de carga horária

---

## 📖 Disciplinas

* Associação com cursos
* Associação com professores
* Controle acadêmico

---

## 📝 Matrículas

* Associação entre aluno e disciplina
* Controle de notas
* Cálculo de média
* Controle de status acadêmico

---

# 🗃 Modelagem do Sistema

O sistema foi estruturado utilizando relacionamento entre entidades.

## 🔗 Relacionamentos

* Um curso possui várias disciplinas
* Um professor pode lecionar várias disciplinas
* Um aluno pode possuir várias matrículas
* Uma matrícula pertence a um aluno
* Uma matrícula pertence a uma disciplina

---

# 🌐 Endpoints da API

## 👨‍🎓 Alunos

| Método | Endpoint     |
| ------ | ------------ |
| GET    | /alunos      |
| GET    | /alunos/{id} |
| POST   | /alunos      |
| PUT    | /alunos/{id} |
| DELETE | /alunos/{id} |

---

## 👨‍🏫 Professores

| Método | Endpoint          |
| ------ | ----------------- |
| GET    | /professores      |
| GET    | /professores/{id} |
| POST   | /professores      |
| PUT    | /professores/{id} |
| DELETE | /professores/{id} |

---

# 🔒 Validação de Dados

O projeto utiliza validações com Jakarta Validation.

Exemplo:

```java
@NotBlank(message = "O nome é obrigatório")
private String nome;
```

As validações ajudam a:

* evitar dados inválidos
* melhorar a segurança
* garantir integridade das informações

---

# 💾 Banco de Dados

A persistência de dados é feita utilizando:

* Spring Data JPA
* Hibernate
* MySQL

As entidades são automaticamente mapeadas para tabelas do banco de dados.

---

# ▶ Como Executar o Projeto

## ✅ Pré-requisitos

* Java 17+
* Maven
* MySQL
* IntelliJ IDEA

---

## 🔽 Clone o repositório

```bash
git clone https://github.com/seu-usuario/aluno-online-api.git
```

---

## ⚙ Configure o banco de dados

No arquivo:

```bash
src/main/resources/application.properties
```

Configure:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/aluno_online
spring.datasource.username=root
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶ Execute a aplicação

```bash
mvn spring-boot:run
```

---

# 🧪 Testes da API

Os testes podem ser realizados utilizando:

* Postman
* Insomnia
* Thunder Client

Exemplo de requisição:

```json
{
  "nome": "Carlos Eduardo",
  "email": "carlos@email.com",
  "cpf": "12345678900",
  "matricula": "2024001",
  "telefone": "83999999999"
}
```

---

# 📈 Objetivos do Projeto

Este projeto foi desenvolvido com foco em:

* aprendizado prático de Spring Boot
* desenvolvimento de APIs REST
* organização de projetos Java
* modelagem de banco de dados
* aplicação de boas práticas
* preparação para projetos profissionais

---

# 👨‍💻 Autor

## Carlos Eduardo Gomes Filho

🎓 Estudante de Ciência da Computação
💻 Foco em Back-End, Redes de Computadores e Infraestrutura
🚀 Desenvolvendo projetos com Java, Spring Boot e Banco de Dados

---

# ⭐ Considerações Finais

O projeto Aluno Online API representa a construção de uma aplicação acadêmica moderna utilizando tecnologias amplamente utilizadas no mercado.

Além da implementação técnica, o sistema foi desenvolvido aplicando conceitos importantes de:

* organização de código
* arquitetura em camadas
* separação de responsabilidades
* boas práticas REST
* integração com banco de dados
* validação de dados

O objetivo é evoluir continuamente o sistema adicionando:

* autenticação JWT
* documentação Swagger
* testes automatizados
* Docker
* deploy em nuvem
* integração com front-end

---

# 📌 Licença

Este projeto está sob a licença MIT.
