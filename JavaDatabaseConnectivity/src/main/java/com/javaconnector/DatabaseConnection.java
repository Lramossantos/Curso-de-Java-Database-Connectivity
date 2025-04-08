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
                System.out.println("Conexão bem-sucedida!");
            }
        } catch (SQLException e) {
            System.err.println("Erro na conexão: " + e.getMessage());
        }
    }
}