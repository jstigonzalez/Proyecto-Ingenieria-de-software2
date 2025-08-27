package co.edu.poli.Pasaporte.model;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Titular {

   
    @Override
	public String toString() {
		return "Titular [id=" + id + ", nombre=" + nombre + ", fecNac=" + fecNac + "]";
	}

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

	public String getFecNac() {
		return fecNac;
	}

	public void setFecNac(String fecNac) {
		this.fecNac = fecNac;
	}

	public Titular(String id, String nombre, String fecNac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecNac = fecNac;
	}

	public Titular() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String fecNac;


}