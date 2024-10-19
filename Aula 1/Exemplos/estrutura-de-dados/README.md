# Projeto Maven Simples

Este é um projeto Maven simples que demonstra como rodar testes unitários utilizando o Maven.

## Pré-requisitos

Antes de iniciar, certifique-se de que você tenha os seguintes requisitos instalados em sua máquina:

- **JDK (Java Development Kit) 11 ou superior**: [Baixar JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Maven 3.6.3 ou superior**: [Baixar Maven](https://maven.apache.org/download.cgi)

### Verificando as instalações

Você pode verificar se o JDK e o Maven estão instalados corretamente, executando os seguintes comandos no terminal:

```bash
java -version
```

## Estrutura do Projeto

O projeto segue a estrutura padrão do Maven:

```css
estrutura-de-dados/
├── src
│   ├── main
│   │   └── java
│   │   │   └── br
│   │   │   │   └── com
│   │   │   │   │   └── unifacisa
│   │   │   │   │   │   └── si
│   │   │   │   │   │   │   └── atal
│   │   │   │   │   │   │   │   └── encadeadas
│   │   │   │   │   │   │   │   └── interfaces
│   │   │   │   │   │   │   │   └── sequenciais
│   └── test
│   │   └── java
│   │   │   └── br
│   │   │   │   └── com
│   │   │   │   │   └── unifacisa
│   │   │   │   │   │   └── si
│   │   │   │   │   │   │   └── atal
│   │   │   │   │   │   │   │   └── encadeadas
│   │   │   │   │   │   │   │   └── interfaces
│   │   │   │   │   │   │   │   └── sequenciais
├── pom.xml
└── README.md
```

- O código-fonte Java está localizado no diretório `src/main/java/br/com/unifacisa/si/atal/`.
- Os testes unitários estão no diretório `src/test/java/br/com/unifacisa/si/atal/`.
- Os contratos para implementações de cada estrutura está em `src/main/java/br/com/unifacisa/si/atal/interfaces`.
- As implementações para cada estrutura está em `src/main/java/br/com/unifacisa/si/atal/sequenciais`.
- As implementações para cada estrutura está em `src/main/java/br/com/unifacisa/si/atal/encadeadas`.
- O arquivo `pom.xml` contém todas as dependências e configurações do Maven.

## Como Executar o Projeto

### 1. Clonar o repositório

Se você ainda não tem o repositório clonado, pode fazê-lo com o seguinte comando:

```bash
git clone <url-do-repositorio> cd <nome-do-repositorio>
```

### 2. Compilar o projeto

Para compilar o projeto e verificar se todas as dependências estão configuradas corretamente, execute:


```bash
mvn clean compile
```

### 3. Executar os testes

Para rodar os testes unitários do projeto, use o comando:

```bash
mvn test
```

Este comando irá:

- Compilar o código do projeto.
- Executar todos os testes presentes em `src/test/java`.

### 4. Limpar o projeto

Se quiser limpar os artefatos gerados durante a compilação e execução de testes, utilize:

```bash
mvn clean
```

## Logs de Testes

Após a execução dos testes, os resultados podem ser visualizados no terminal. Além disso, um relatório de testes será gerado no seguinte diretório:

```bash 
target/surefire-reports/
```

Este diretório contém relatórios no formato `.txt` e `.xml`, que podem ser usados para analisar os resultados dos testes.

## Dependências

As dependências são gerenciadas através do arquivo `pom.xml`.

## Tecnologias Utilizadas

- **Java**
- **Maven**
- **JUnit 5** (para testes unitários)

## Problemas Comuns

### Problema: "Command not found: mvn"

- Verifique se o Maven está instalado e o caminho do Maven está configurado corretamente na variável de ambiente `PATH`.

### Problema: Erros de versão de dependências

- Certifique-se de que as versões das dependências no `pom.xml` são compatíveis com sua versão do JDK.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou relatar problemas.
