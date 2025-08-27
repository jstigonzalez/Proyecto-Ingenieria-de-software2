package co.edu.poli.Pasaporte.model;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Pasaporte {

    
    @Override
	public String toString() {
		return "Pasaporte [id=" + id + ", fechaExpedicion=" + fechaExpedicion + ", titular=" + titular + ", pais="
				+ pais + "]";
	}

	public Pasaporte(String id, String fechaExpedicion, Titular titular, Pais pais) {
		super();
		this.id = id;
		this.fechaExpedicion = fechaExpedicion;
		this.titular = titular;
		this.pais = pais;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Pasaporte() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String fechaExpedicion;

    /**
     * 
     */
    private Titular titular;

    /**
     * 
     */
    private Pais pais;





}