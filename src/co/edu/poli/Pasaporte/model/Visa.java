package co.edu.poli.Pasaporte.model;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Visa {

   
    @Override
	public String toString() {
		return "Visa [num=" + num + ", pais=" + pais + ", numEntry=" + numEntry + ", pasaporte=" + pasaporte + "]";
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getNumEntry() {
		return numEntry;
	}

	public void setNumEntry(int numEntry) {
		this.numEntry = numEntry;
	}

	public Pasaporte getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	public Visa(String num, Pais pais, int numEntry, Pasaporte pasaporte) {
		super();
		this.num = num;
		this.pais = pais;
		this.numEntry = numEntry;
		this.pasaporte = pasaporte;
	}

	public Visa() {
    }

    /**
     * 
     */
    private String num;

    /**
     * 
     */
    private Pais pais;

    /**
     * 
     */
    private int numEntry;

    /**
     * 
     */
    private Pasaporte pasaporte;



}