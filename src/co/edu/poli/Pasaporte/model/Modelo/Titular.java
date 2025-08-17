package co.edu.poli.Pasaporte.model.Modelo;

import java.io.*;
import java.util.*;

public class Titular {

	public Titular() {
	}

	public String id;

	public String nombre;

	public String fecha;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Titular(String id, String nombre, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Titular [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + "]";
	}

}