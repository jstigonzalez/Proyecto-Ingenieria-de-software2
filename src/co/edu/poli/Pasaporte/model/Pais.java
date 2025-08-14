package co.edu.poli.Pasaporte.model;

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

   
    public List <Ciudad> ciudad;


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


	public List<Ciudad> getCiudad() {
		return ciudad;
	}


	public void setCiudad(List<Ciudad> ciudad) {
		this.ciudad = ciudad;
	}


	public Pais(String codigo, String nombre, List<Ciudad> ciudad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}


	@Override
	public String toString() {
		return "Pais [codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}




}