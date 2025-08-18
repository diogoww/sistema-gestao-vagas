# 🏢 Sistema de Gestão de Vagas (Backend)

Projeto backend para gestão de vagas, empresas e candidatos. Atualmente em desenvolvimento, com foco na implementação de testes automatizados e melhoria da qualidade do código. A implantação, monitoramento, frontend e alguns ajustes ainda serão adicionados.

## 🔜 Status
- Em desenvolvimento (fase de testes e qualidade de código)
- Implantação/monitoramento e frontend: pendentes

## 🖥️ Tecnologias
- Java 17
- Spring Boot 3.4.4
  - Spring Web
  - Bean Validation
  - Spring Data JPA
  - Spring Security (com JWT)
- PostgreSQL
- Maven (wrapper incluído: `mvnw`/`mvnw.cmd`)
- Lombok
- Auth0 Java JWT (`com.auth0:java-jwt`)
- OpenAPI/Swagger (`springdoc-openapi`)
- Docker Compose (para o banco de dados)

## 🏗️ Estrutura (módulos principais)
- `candidate`: cadastro/autenticação e operações de candidatos
- `company`: cadastro/autenticação de empresas e gestão de vagas
- `security`: filtros e configuração de segurança/JWT
- `config`, `exceptions`, `providers`: suportes e utilitários

## ✅ Requisitos
- JDK 17
- Docker + Docker Compose (opcional, para subir o PostgreSQL rapidamente)

## 🏃 Como rodar localmente
1. Suba o banco (opcional, via Docker Compose):
   ```bash
   cd gestao_vagas
   docker-compose up -d
   ```
2. Execute a aplicação (use o wrapper do Maven):
   - Windows:
     ```bash
     mvnw.cmd spring-boot:run
     ```
   - Linux/macOS:
     ```bash
     ./mvnw spring-boot:run
     ```
3. A aplicação ficará disponível em `http://localhost:8080`.

## ⚙️ Configuração
Os parâmetros padrão estão em `gestao_vagas/src/main/resources/application.properties` (PostgreSQL local, `ddl-auto=update`).

Recomendações de segurança (para produção):
- Mover os segredos JWT do arquivo de propriedades para variáveis de ambiente:
  - `security.token.secret` → `SECURITY_TOKEN_SECRET`
  - `security.token.secret.candidate` → `SECURITY_TOKEN_SECRET_CANDIDATE`
- Configurar usuário/senha/URL do banco por variáveis de ambiente (`SPRING_DATASOURCE_URL`, `SPRING_DATASOURCE_USERNAME`, `SPRING_DATASOURCE_PASSWORD`).

## 🗃️ Documentação da API
- Swagger UI: `http://localhost:8080/swagger-ui/index.html`

## 🌐 Endpoints (visão geral)
- Autenticação empresa: `POST /company/auth`
- Autenticação candidato: `POST /candidate/auth`
- Cadastro de vaga (empresa): `POST /company/job/` (requer JWT com role `COMPANY`)

Demais endpoints e contratos podem ser explorados via Swagger.

## 🔍 Testes e Qualidade
- Testes: `./mvnw test` (ou `mvnw.cmd test` no Windows)
- Melhoria contínua de cobertura e regras de qualidade em andamento.

## 🗺️ Roadmap
- Testes e qualidade de código (em progresso)
- Implantação: Dockerfile, CI/CD (GitHub Actions), variáveis de ambiente
- Observabilidade e monitoramento: Spring Boot Actuator, métricas (Prometheus/Grafana), logs estruturados
- Frontend para consumo das APIs
- Ajustes finais de segurança e DX (tratamento de erros, mensagens, validações)

## 📜 Licença
A definir. 