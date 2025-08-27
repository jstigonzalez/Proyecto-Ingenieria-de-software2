package co.edu.poli.Pasaporte.model;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Ciudad {

   
    @Override
	public String toString() {
		return "Ciudad [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

	public Ciudad(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
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

	public Ciudad() {
    }

    /**
     * 
     */
    private String codigo;

    /**
     * 
     */
    private String nombre;


}