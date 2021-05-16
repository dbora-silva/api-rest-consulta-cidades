# api-rest-consulta-cidades
API REST de consulta de cidades no Brasil

# Requisitos:

- Java 1.16
- Docker

# Como rodar:

- Iniciar o docker:

`docker run --name cities-db --mount src="/c/workfolder/sql-paises-estados-cidades/PostgreSQL",dst=/tmp,type=bind -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres`

- Rodar o projeto pela IDE IntelliJ.
