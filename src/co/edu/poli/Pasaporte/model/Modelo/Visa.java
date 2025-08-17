package co.edu.poli.Pasaporte.model.Modelo;

import java.io.*;
import java.util.*;

public class Visa {

	public Visa() {
	}

	public String numero;

	public Pais pais;

	public Pasaporte pasaporte;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Pasaporte getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	public Visa(String numero, Pais pais, Pasaporte pasaporte) {
		super();
		this.numero = numero;
		this.pais = pais;
		this.pasaporte = pasaporte;
	}

	@Override
	public String toString() {
		return "Visa [numero=" + numero + ", pais=" + pais + ", pasaporte=" + pasaporte + "]";
	}

}