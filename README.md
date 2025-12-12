# SWAPI batalha de atributos - Backend

## 📖 Descrição

**SWAPI Batalha de atributos** é uma API REST desenvolvida com Spring Boot que oferece um jogo de batalha temático de Star Wars. A aplicação integra-se com a [SWAPI (Star Wars API)](https://swapi.dev/) para obter dados de personagens e permite criar batalhas onde dois personagens aleatórios competem com base em seus atributos de massa.

Este é um projeto backend completo que fornece endpoints para iniciar batalhas e obter resultados de confrontos entre personagens do universo Star Wars de forma aleatória e dinâmica.

---

## ✨ Características

- 🎮 **Jogo de Batalha Aleatória**: Seleciona dois personagens aleatórios de Star Wars
- ⚔️ **Sistema de Confronto**: Determina o vencedor comparando a massa dos personagens
- 🌐 **Integração com SWAPI**: Consome dados da API oficial de Star Wars
- 📡 **API REST**: Endpoints bem definidos e RESTful
- 🏗️ **Arquitetura Limpa**: Separação de responsabilidades com Controllers, Services e Clients
- 🚀 **Spring Boot 4.0.0**: Framework moderno e robusto
- 🔄 **OpenFeign**: Cliente HTTP declarativo para consumo de APIs externas

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

## 🎨 Oportunidade: Contribuindo com um Frontend

Este projeto oferece uma **excelente oportunidade para desenvolvê-lo com uma interface visual**! Se você deseja criar um **frontend interativo** para o jogo de batalha:

### 💡 Sugestões de Implementação

- **React/Vue.js/Angular**: Crie uma interface amigável para iniciar batalhas
- **Animações**: Adicione efeitos visuais dos personagens em confronto
- **Cards**: Exiba as informações dos personagens em cards atraentes
- **Score/Histórico**: Mantenha registro das batalhas anteriores
- **Temas Star Wars**: Aplique estilo temático do universo Star Wars

### 🔗 Como Conectar

Certifique-se de:

1. A API está rodando em `http://localhost:8080`
2. Configure CORS no backend, se necessário
3. Chame o endpoint `GET /v1/battles/start` para cada nova batalha

### 📚 Exemplo de Chamada Frontend

```javascript
// JavaScript/React Example
const iniciarBatalha = async () => {
  try {
    const response = await fetch('http://localhost:8080/v1/battles/start');
    const resultado = await response.json();
    console.log(`${resultado.winner} venceu!`);
  } catch (error) {
    console.error('Erro ao iniciar batalha:', error);
  }
};
```

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
- **Spring Boot Test**: Framework de testes

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

- [ ] Adicionar mais atributos para comparação (altura, ano de nascimento, etc.)
- [ ] Implementar autenticação e autorização
- [ ] Adicionar cache para dados de personagens
- [ ] Criar histórico de batalhas com persistência em banco de dados
- [ ] Documentação Swagger/OpenAPI
- [ ] Testes de integração com SWAPI
- [ ] Tratamento de erros mais robusto
- [ ] Métricas e monitoramento com Spring Actuator

---

## 📄 Licença

Este projeto está licenciado sob a **Licença MIT** - veja o arquivo [LICENSE](LICENSE) para detalhes completos.


---

## 🙏 Agradecimentos

- **[SWAPI](https://swapi.dev/)** - API pública e gratuita do universo Star Wars


---

## 📧 Contato e Suporte

Se tiver dúvidas, sugestões ou encontrar problemas:

- Abra uma **Issue** no repositório
- Faça um **Pull Request** com melhorias
- Entre em contato diretamente com o desenvolvedor

---

**Desenvolvido com ❤️ usando Spring Boot e Java**

**Divirta-se no jogo de batalha de Star Wars!** ⚔️🌌

