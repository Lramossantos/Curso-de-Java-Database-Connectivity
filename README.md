# 🚀 Exemplo de Conexão com Banco de Dados MySQL em Java

Este projeto demonstra como estabelecer uma conexão com um banco de dados MySQL usando JDBC (Java Database Connectivity) em um projeto Maven. O exemplo inclui uma implementação simples que se conecta a um banco de dados chamado `exemplobd`.

## 📋 Pré-requisitos

- JDK 8 ou superior ☕
- MySQL instalado e em execução 🛠️
- IDE (como Eclipse ou IntelliJ) 🖥️

## 📂 Estrutura do Projeto

```
seu-projeto/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── javaconnector/
                    └── DatabaseConnection.java
```

## 🛠️ Configuração do Banco de Dados

1. **Instale o MySQL**.
2. **Crie um banco de dados**:
   ```sql
   CREATE DATABASE exemplobd;
   ```

3. **Configure o usuário**:
   - O exemplo usa o usuário `root` com a senha `Leo2015ramos$`. Altere conforme necessário.

## 💻 Código

O código para conectar ao banco de dados é o seguinte:

```java
package com.javaconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        // URL do banco de dados
        String url = "jdbc:mysql://localhost:3306/exemplobd"; // Altere para o seu banco
        String user = "root"; // Altere para seu usuário
        String password = "Leo2015ramos$"; // Altere para sua senha

        // Estabelecendo a conexão
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Conexão bem-sucedida! 🎉");
            }
        } catch (SQLException e) {
            System.err.println("Erro na conexão: " + e.getMessage() + " ❌");
        }
    }
}
```

### 📖 Explicação do Código

- **Pacote**: O código está organizado sob o pacote `com.javaconnector`.
- **Importações**: Importa classes necessárias para a conexão com o banco de dados.
- **Estabelecendo Conexão**:
  - A URL do banco de dados, nome de usuário e senha são definidos.
  - Utiliza `DriverManager.getConnection()` para tentar conectar ao banco de dados.
  - Um bloco `try-with-resources` garante que a conexão seja fechada automaticamente.
- **Tratamento de Erros**: Se a conexão falhar, uma mensagem de erro é exibida.

## 🏃 Execução

1. **Abra o arquivo `DatabaseConnection.java`** e configure as credenciais de conexão conforme necessário.
2. **Compile e execute o projeto**:
   - No Eclipse, clique com o botão direito no arquivo e selecione `Run As` > `Java Application`.

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## 📜 Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 📫 Contato

Para mais informações, entre em contato com [leonardoramosdossantos92@gmail.com](leonardoramosdossantos92@gmail.com).
