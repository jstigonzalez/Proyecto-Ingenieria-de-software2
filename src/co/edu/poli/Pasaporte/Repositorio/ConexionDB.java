package co.edu.poli.Pasaporte.Repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL = "postgresql://postgres.vhfgnxktfzqpkxrwmtmg:[Ingeneria_2Dt]@aws-1-us-west-1.pooler.supabase.com:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Ingeneria_2Dt"; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
