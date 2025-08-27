package co.edu.poli.Pasaporte.Repositorio;

import co.edu.poli.Pasaporte.model.Pais;
import co.edu.poli.Pasaporte.model.Pasaporte;
import co.edu.poli.Pasaporte.model.Titular;

import java.sql.*;

public class Pasaporte_DAO implements Crud<Pasaporte> {

    @Override
    public void create_T(Pasaporte pasaporte) {
        String sql = "INSERT INTO pasaporte (id, fecha_expedicion, titular, pais) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pasaporte.getId());
            stmt.setString(2, pasaporte.getFechaExpedicion());
            stmt.setString(3, pasaporte.getTitular().toString()); // Ajustar según modelo Titular
            stmt.setString(4, pasaporte.getPais().toString());    // Ajustar según modelo Pais
            stmt.executeUpdate();
            System.out.println("✅ Pasaporte creado en Supabase");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Pasaporte read_T(String id) {
        String sql = "SELECT * FROM pasaporte WHERE id = ?";
        Pasaporte pasaporte = null;

        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String fechaExpedicion = rs.getString("fecha_expedicion");
                String nombreTitular = rs.getString("titular");
                String nombrePais = rs.getString("pais");

                pasaporte = new Pasaporte(
                    rs.getString("id"),
                    fechaExpedicion,
                    new Titular(nombreTitular, nombrePais, nombrePais),
                    new Pais(nombrePais, nombrePais, null)
                );

                System.out.println("✅ Pasaporte leído desde BD:");
                System.out.println("ID: " + pasaporte.getId());
                System.out.println("Fecha de expedición: " + pasaporte.getFechaExpedicion());
                System.out.println("Titular: " + pasaporte.getTitular().getNombre());
                System.out.println("País: " + pasaporte.getPais().getNombre());
            } else {
                System.out.println("❌ No se encontró el pasaporte con ID: " + id);
            }
        } catch (SQLException e) {
            System.err.println("❌ Error leyendo pasaporte: " + e.getMessage());
        }

        return pasaporte;
    }
    

    @Override
    public void update_T(Pasaporte pasaporte) {
        String sql = "UPDATE pasaporte SET fecha_expedicion = ?, titular = ?, pais = ? WHERE id = ?";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pasaporte.getFechaExpedicion());
            stmt.setString(2, pasaporte.getTitular().toString());
            stmt.setString(3, pasaporte.getPais().toString());
            stmt.setString(4, pasaporte.getId());
            stmt.executeUpdate();
            System.out.println("✅ Pasaporte actualizado en Supabase");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete_T(String id) {
        String sql = "DELETE FROM pasaporte WHERE id = ?";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, id);
            stmt.executeUpdate();
            System.out.println("✅ Pasaporte eliminado de Supabase");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
 