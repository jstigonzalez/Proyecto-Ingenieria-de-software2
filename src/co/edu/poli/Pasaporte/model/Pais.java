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

   
    public String ciudad;


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


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public Pais(String codigo, String nombre, String ciudadPais) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ciudad = ciudadPais;
	}


	@Override
	public String toString() {
		return "Pais [codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}




}