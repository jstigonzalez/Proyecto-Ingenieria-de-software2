package co.edu.poli.Pasaporte.model.Vista;

import java.util.ArrayList;
import java.util.List;

import co.edu.poli.Pasaporte.model.Modelo.Ciudad;
import co.edu.poli.Pasaporte.model.Modelo.Pais;
import co.edu.poli.Pasaporte.model.Modelo.Pasaporte;
import co.edu.poli.Pasaporte.model.Modelo.Titular;

public class Cliente {

    public static void main(String[] args) {

        Ciudad c1 = new Ciudad("001", "Bogota");

        List<Ciudad> ciudadesCol = new ArrayList<>();
        ciudadesCol.add(c1);

        Pais pais = new Pais("456123", "Colombia", ciudadesCol);

        Titular titular = new Titular("123456", "Juan Perez", "199-06-15");

        Pasaporte pasaporte = new Pasaporte("Pas-789", "2025-01-01", titular, pais);

        System.out.println("=== Información del Pasaporte ===");
        System.out.println(pasaporte);
    }

}
