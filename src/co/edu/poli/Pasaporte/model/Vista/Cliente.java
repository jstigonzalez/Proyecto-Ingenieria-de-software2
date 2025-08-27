package co.edu.poli.Pasaporte.model.Vista;

import java.util.ArrayList;
import java.util.List;

import co.edu.poli.Pasaporte.model.Modelo.Ciudad;
import co.edu.poli.Pasaporte.model.Modelo.Pais;
import co.edu.poli.Pasaporte.model.Modelo.Pasaporte;
import co.edu.poli.Pasaporte.model.Modelo.Titular;
import co.edu.poli.Pasaporte.model.Repositorio.PasaporteRepositorio;

public class Cliente {
    public static void main(String[] args) {

        // Crear Ciudad y País
        Ciudad c1 = new Ciudad("001", "Bogotá");
        List<Ciudad> ciudadesCol = new ArrayList<>();
        ciudadesCol.add(c1);
        Pais colombia = new Pais("CO", "Colombia", ciudadesCol);

        // Crear Titular
        Titular titular = new Titular("123456", "Juan Pérez", "1995-06-15");

        // Crear Pasaporte
        Pasaporte pasaporte1 = new Pasaporte("PAS-789", "2025-01-01", titular, colombia);

        // === Usar el repositorio ===
        PasaporteRepositorio repo = new PasaporteRepositorio();

        // Crear
        repo.crear(pasaporte1);

        // Leer por id
        System.out.println("Buscar PAS-789: " + repo.leer("PAS-789"));

        // Actualizar
        Titular titularNuevo = new Titular("123456", "Juan Pérez Gómez", "1995-06-15");
        Pasaporte pasaporteActualizado = new Pasaporte("PAS-789", "2026-01-01", titularNuevo, colombia);
        repo.actualizar("PAS-789", pasaporteActualizado);

        // Leer todos
        System.out.println("\nLista de pasaportes: " + repo.leerTodos());

        // Eliminar
        repo.eliminar("PAS-789");
        System.out.println("\nDespués de eliminar: " + repo.leerTodos());
    }
}
