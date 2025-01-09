# 📖 FórumHub - Challenge Back End
O FórumHub é uma API REST desenvolvida para replicar as funcionalidades de um fórum, como os utilizados na Alura, onde alunos podem tirar dúvidas sobre cursos e projetos. Este desafio tem como objetivo criar uma API com operações de CRUD completas, validações de regras de negócio, autenticação e autorização, e uma base de dados relacional para armazenar informações.
## 🛠️ Tecnologias Utilizadas
- **Java (JDK 21)**
- **Spring Boot**
- **Spring Security**
- **Spring Data JPA**
- **MySQL**
- **Auth0 JWT**
- **Bean Validation**
- **Flyway**
- **Lombok**
- **Maven**
- **Insomnia**
- **Trello**
## 🎯 Funcionalidades
A API permite as seguintes operações relacionadas aos tópicos do fórum:
- **Criar um novo tópico**: Permitir que os usuários adicionem novos tópicos.
- **Listar todos os tópicos**: Retornar uma lista com todos os tópicos criados.
- **Detalhar um tópico**: Retornar os detalhes de um tópico individual.
- **Atualizar um tópico**: Editar informações de um tópico existente.
- **Excluir um tópico**: Remover um tópico do sistema.

Além disso:
- **Validações**: Não permitir a criação de um topico repetido.
- **Autenticação**: Restringir o acesso aos recurso da API apenas para usuarios cadastrados.
## 🚀 Como Executar
1. Clone o repositório.
2. Certifique-se de que o Maven está configurado e execute o comando para baixar as dependências: `mvn clean install`.
3. Configure o Banco de Dados: edite o arquivo `application.properties` com as credenciais apropriadas.
4. Inicie a Aplicação com o comando: `mvn spring-boot:run`.
5. Você pode usar uma ferramenta para testar os endpoints como o insomnia ou acessar o <a target="_blank" href="http://localhost:8080/swagger-ui/index.html">`Swagger`</a> pelo seu navegador.


Desenvolvido por <a target="_blank" href="https://github.com/LucasMSS98">Lucas menezes</a>
