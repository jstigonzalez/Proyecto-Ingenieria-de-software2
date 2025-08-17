package co.edu.poli.Pasaporte.model.Modelo;

import java.io.*;
import java.util.*;

public class Pasaporte {

	public Pasaporte() {
	}

	public String id;

	public String fechaExp;

	public Titular titular;

	public Pais pais;

	public Pasaporte(String id, String fechaExp, Titular titular, Pais pais) {
		this.id = id;
		this.fechaExp = fechaExp;
		this.titular = titular;
		this.pais = pais;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFechaExp() {
		return this.fechaExp;
	}

	public void setFechaExp(String fechaExp) {
		this.fechaExp = fechaExp;
	}

	public Titular getTitular() {
		return this.titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Pasaporte [id=" + id + ", fechaExp=" + fechaExp + ", titular=" + titular + ", pais=" + pais + "]";
	}
}