package co.edu.poli.Pasaporte.Vista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.edu.poli.Pasaporte.Repositorio.ConexionDB;

public class Cliente {
    public static void main(String[] args) {

        try (Connection connection = ConexionDB.getConnection()) {
            if (connection != null) {
                System.out.println("✅ Conexión exitosa con la base de datos.");

                String sql = "INSERT INTO pasaporte (codigo, fecha_expedicion, titular_nombre, pais_nombre) VALUES (?, ?, ?, ?)";
                try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                    stmt.setString(1, "Pas-789");
                    stmt.setDate(2, java.sql.Date.valueOf("2025-01-01"));
                    stmt.setString(3, "Juan Perez");
                    stmt.setString(4, "Colombia");

                    int filas = stmt.executeUpdate();
                    System.out.println("✅ Filas insertadas: " + filas);
                }
            } else {
                System.out.println("❌ No se pudo conectar.");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
