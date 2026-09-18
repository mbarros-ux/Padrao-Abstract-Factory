# Padrão Abstract Factory - Suites de Segurança Cibernética

Implementação do padrão de projeto **Abstract Factory** em Java, demonstrando a criação de famílias de objetos relacionados sem especificar suas classes concretas.

## Descrição

Este projeto implementa o padrão Abstract Factory para criar **suites completas de segurança cibernética**, garantindo que todos os componentes de uma suíte sejam compatíveis entre si. O padrão permite que o sistema provisione famílias inteiras de produtos (Firewall + Antivírus) de forma coerente, evitando que componentes de diferentes níveis (ex: Firewall Avançado com Antivírus Básico) sejam misturados.

### Contexto
O sistema gerencia duas famílias de produtos de segurança:

** Suite Básica:**
- Firewall Básico (regras padrão)
- Antivírus Básico (varredura simples)

** Suite Avançada:**
- Firewall Next-Gen (inspeção profunda de pacotes)
- Antivírus com Heurística e IA

## Estrutura do Projeto
```bash
src/
├── main/
│ └── padroescriacao/abstractfactory/
│ ├── IFirewall.java (Interface de produto)
│ ├── IAntivirus.java (Interface de produto)
│ ├── ISuiteSeguranca.java (Interface da fábrica abstrata)
│ ├── FirewallBasico.java (Produto concreto)
│ ├── FirewallAvancado.java (Produto concreto)
│ ├── AntivirusBasico.java (Produto concreto)
│ ├── AntivirusAvancado.java (Produto concreto)
│ ├── SuiteSegurancaBasica.java (Fábrica concreta)
│ ├── SuiteSegurancaAvancada.java (Fábrica concreta)
│ └── SistemaSeguranca.java (Classe cliente)
│
└── test/
└── padroescriacao/abstractfactory/
└── SistemaSegurancaTest.java (Casos de teste)
```

## Padrão Abstract Factory

### Problema Resolvido
Sem o Abstract Factory, o código cliente precisaria instanciar cada componente individualmente, correndo o risco de misturar produtos incompatíveis. Com o padrão:

- **Consistência garantida**: A fábrica assegura que todos os produtos pertençam à mesma família
- **Desacoplamento**: O cliente depende apenas das interfaces, não das implementações concretas
- **Extensibilidade**: Novas famílias (ex: Suite Corporativa) podem ser adicionadas sem modificar o código existente
- **Princípio Aberto/Fechado (OCP)**: O sistema está aberto para extensão, mas fechado para modificação

### Componentes
- **Interfaces de Produto** (`IFirewall`, `IAntivirus`): Definem o contrato para cada tipo de produto
- **Produtos Concretos**: Implementações específicas de cada família (Básica/Avançada)
- **Fábrica Abstrata** (`ISuiteSeguranca`): Declara os métodos para criar cada produto
- **Fábricas Concretas**: Implementam a fábrica para criar famílias específicas
- **Classe Cliente** (`SistemaSeguranca`): Usa a fábrica abstrata para obter os produtos

## Testes

O projeto possui **4 casos de teste** implementados com **JUnit 5**, validando:

- Ativação do Antivírus da Suite Básica
- Ativação do Antivírus da Suite Avançada
- Ativação do Firewall da Suite Básica
- Ativação do Firewall da Suite Avançada

### Como Executar os Testes

1. Abra o projeto no **IntelliJ IDEA**
2. Clique com o botão direito na pasta `test`
3. Selecione **Run 'All Tests'**
4. Verifique se todos os testes passam (barra verde)

Ou via terminal:
```bash
mvn test
```
### Diagrama de Classes
O diagrama UML está disponível na imagem diagrama-abstract-factory.png e mostra:
- As interfaces de produto (IFirewall, IAntivirus)
- A interface da fábrica abstrata (ISuiteSeguranca)
- As 4 implementações concretas dos produtos
- As 2 fábricas concretas (Básica e Avançada)
- A classe cliente SistemaSeguranca
- Os relacionamentos de implementação e dependência

### Diferença entre Factory Method e Abstract Factory
```bash
| Característica | Factory Method | Abstract Factory |
|----------------|----------------|------------------|
| **Escopo** | Cria **um** tipo de objeto | Cria **famílias** de objetos relacionados |
| **Foco** | Delega criação para subclasses | Composição de múltiplas factories |
| **Exemplo** | Criar uma ferramenta de segurança | Criar uma suite completa (Firewall + Antivírus) |
```
### Tecnologias
- Java 21
- JUnit 5 (JUnit Jupiter)
- IntelliJ IDEA
- Maven (gerenciamento de dependências)
- Draw.io (diagrama UML)

### Conceitos Aplicados
- Padrão Criacional Abstract Factory
- Programação orientada a interfaces
- Princípio da Responsabilidade Única (SRP)
- Princípio Aberto/Fechado (OCP)
- Princípio da Substituição de Liskov (LSP)
- Testes Unitários com JUnit
- Desacoplamento de dependências
