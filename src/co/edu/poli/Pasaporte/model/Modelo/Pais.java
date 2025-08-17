package co.edu.poli.Pasaporte.model.Modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Pais {

	public Pais() {
	}

	public String codigo;

	public String nombre;

	public List<Ciudad> ciudades;

	public Pais(String codigo, String nombre, List<Ciudad> ciudades) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.ciudades = ciudades;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	@Override
	public String toString() {
		return "Pais [codigo=" + codigo + ", nombre=" + nombre + ", ciudades=" + ciudades + "]";
	}

}