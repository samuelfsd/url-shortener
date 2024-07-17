### url-shortener 

Resolução do desafio de criar um encurtador URL encontrado no repositório [LINK](https://github.com/backend-br/desafios/blob/master/url-shortener/PROBLEM.md).
### Tecnologias utilizadas

- Java 17
- Maven
- Spring Boot (Spring WEB, Spring JPA, DevTools)
- H2Database


### Requisitos

- O encurtador de URLs recebe uma URL longa como parâmetro inicial. ✅
- O encurtamento será composto por um mínimo de 05 e um máximo de 10 caracteres. ✅
- Apenas letras e números são permitidos no encurtamento. ✅
- A URL encurtada será salva no banco de dados com um prazo de validade (você pode escolher a duração desejada). ✅
- Ao receber uma chamada para a URL encurtada https://xxx.com/DXB6V, você deve fazer o redirecionamento para a URL original salva no banco de dados. Caso a URL não seja encontrada no banco, retorne o código de status HTTP 404 (Not Found). ✅


### @TODO

- [x] Pegar a URL do body da aplicação
- [x] criar a função para retornar a url curta com alguma lib externa
- [x] criar query customizada no repository
- [x] criar endpoint para redirecionamento
- [x] redirecionamento 

### Melhorias

- [] Adicionar PostgresSQL
- [] Adicionar Docker
- [] Adicionar Testes
