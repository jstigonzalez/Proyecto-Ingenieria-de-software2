package co.edu.poli.Pasaporte.model;

import co.edu.poli.Pasaporte.model.Titular;
import co.edu.poli.Pasaporte.model.Pais;

import java.io.*;
import java.util.*;


public class Pasaporte {

 
    public Pasaporte() {
    }

    
    public String id;

    
    public Titular titular;

    
    public Pais pais;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public Pasaporte(String id, Titular titular, Pais pais) {
		super();
		this.id = id;
		this.titular = titular;
		this.pais = pais;
	}


	@Override
	public String toString() {
		return "Pasaporte [id=" + id + ", titular=" + titular + ", pais=" + pais + "]";
	}




}