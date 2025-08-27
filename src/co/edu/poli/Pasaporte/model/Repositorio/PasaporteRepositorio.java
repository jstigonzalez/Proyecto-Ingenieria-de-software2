package co.edu.poli.Pasaporte.model.Repositorio;

import java.util.ArrayList;
import java.util.List;

import co.edu.poli.Pasaporte.model.Modelo.Pasaporte;

public class PasaporteRepositorio {
    // Atributo para almacenar los pasaportes

    private List<Pasaporte> pasaportes;

    public PasaporteRepositorio() {
        this.pasaportes = new ArrayList<>();
    }

    public void crear(Pasaporte pasaporte) {
        pasaportes.add(pasaporte);
    }

    public Pasaporte leer(String id) {
        for (Pasaporte p : pasaportes) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public List<Pasaporte> leerTodos() {
        return pasaportes;
    }

    public boolean actualizar(String id, Pasaporte nuevo) {
        for (int i = 0; i < pasaportes.size(); i++) {
            if (pasaportes.get(i).getId().equals(id)) {
                pasaportes.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String id) {
        return pasaportes.removeIf(p -> p.getId().equals(id));
    }
}
