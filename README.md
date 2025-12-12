# SWAPI batalha de atributos - Backend

## 📖 Descrição

API REST desenvolvida em Spring Boot que integra a SWAPI para realizar batalhas entre dois personagens aleatórios de Star Wars, comparando seus atributos (massa).

---

## ✨ Características

- Seleção aleatória de personagens.

- Comparação de atributos para determinar o vencedor.

- Consumo da SWAPI via OpenFeign.

- Arquitetura organizada em Controllers, Services e Clients.

---

## 🛠️ Setup e Configuração

### Pré-requisitos

Antes de começar, certifique-se de ter instalado:

- **Java 17** ou superior
- **Maven 3.6+** (ou use o `mvnw` incluído no projeto)
- **Git** (para clonar o repositório)

### Instalação

1. **Clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/swapi-project.git
   cd swapi-project
   ```

2. **Instale as dependências**
   ```bash
   mvn clean install
   ```
   
   Ou, se preferir usar o Maven Wrapper:
   ```bash
   ./mvnw clean install  # Linux/Mac
   mvnw.cmd clean install  # Windows
   ```

3. **Execute a aplicação**
   ```bash
   mvn spring-boot:run
   ```
   
   Ou:
   ```bash
   ./mvnw spring-boot:run  # Linux/Mac
   mvnw.cmd spring-boot:run  # Windows
   ```

A aplicação estará disponível em: `http://localhost:8080`

### Configuração

Se desejar alterar a porta ou outras configurações, edite o arquivo `application.properties`:

```properties
server.port=8080
spring.application.name=swapi-project
```

---

## 🔌 API Endpoints

### Iniciar uma Batalha

**Endpoint**: `GET /v1/battles/start`

**Descrição**: Inicia uma nova batalha entre dois personagens aleatórios de Star Wars.

**Requisição**:
```bash
curl -X GET http://localhost:8080/v1/battles/start
```

**Resposta** (HTTP 200):
```json
{
  "winner": "Luke Skywalker",
  "player1": "Luke Skywalker",
  "value1": 77.0,
  "player2": "C-3PO",
  "value2": 75.0,
  "attributeUsed": "MASS"
}
```

**Campos da Resposta**:
- `winner` (String): Nome do personagem vencedor
- `player1` (String): Nome do primeiro personagem
- `value1` (Double): Valor do atributo do primeiro personagem (massa em kg)
- `player2` (String): Nome do segundo personagem
- `value2` (Double): Valor do atributo do segundo personagem (massa em kg)
- `attributeUsed` (String): Atributo utilizado na comparação (atualmente: MASS)

**Possíveis Respostas**:
- O personagem com maior massa ganha
- Em caso de empate na massa, o resultado será "Empate"
- Valores não numéricos na API são tratados como 0.0

---

## 🧪 Testes

Para executar os testes unitários:

```bash
mvn test
```

Ou:

```bash
./mvnw test
```

---

## 🔧 Dependências Principais

- **Spring Boot Starter WebMVC**: Framework web e REST
- **Spring Cloud OpenFeign**: Cliente HTTP declarativo
- **Lombok**: Redução de boilerplate de código

Veja `pom.xml` para uma lista completa das dependências.

---

## 🚀 Build e Deploy

### Build do Projeto

```bash
mvn clean package
```

Isso gera um JAR executável em `target/swapi-project-0.0.1-SNAPSHOT.jar`

### Executar o JAR

```bash
java -jar target/swapi-project-0.0.1-SNAPSHOT.jar
```

---

## 📝 Possíveis Melhorias Futuras

- Novos atributos de comparação

- Persistência e histórico de batalhas

- Documentação via Swagger

- Cache e melhor tratamento de erros

---

## 💡 Sugestões de Implementação

- **React/Vue.js/Angular:** Crie uma interface amigável para iniciar batalhas

- **Animações:** Adicione efeitos visuais dos personagens em confronto

- **Cards:** Exiba as informações dos personagens em cards atraentes

- **Score/Histórico:** Mantenha registro das batalhas anteriores

- **Temas Star Wars:** Aplique estilo temático do universo Star Wars

---

## 📄 Licença

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🙏 Agradecimentos

- **[SWAPI](https://swapi.dev/)** - API pública e gratuita do universo Star Wars


---

**Desenvolvido com ❤️ por um grande fã de Star Wars usando Spring Boot e Java**

**Divirta-se no jogo de batalha de Star Wars!** ⚔️🌌

