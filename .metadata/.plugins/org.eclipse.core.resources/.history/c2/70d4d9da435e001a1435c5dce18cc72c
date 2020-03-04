package edu.oracle.school.models; // paquete donde esta ubicada mi clase

import java.util.*; // importando la libreria java util

/**
 * Esta es la clase Persona
 * 
 * @author diegoprietotorres
 *
 */
public class Person {
	/*
	 * Propiedades
	 */
	private String name;
	private char genere;
	private Date birthDate;
	public long cedula;
	
	/*
	 * Constructor
	 */
	public Person(String name, char genere, long cedula, Date birthDate) {
		this.name = name;
		this.genere = genere;
		this.cedula = cedula;
		this.birthDate = birthDate;
	}
	
	/*
	 * Métodos de acceso
	 */
	public String getName() {
		return this.name;
	}
	
	/*
	 * Métodos de modificación
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGenere(char genere) {
		this.genere = genere;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	/*
	 * Funciones publicas
	 */
	public String print() {
		String result = "\n Datos de Persona";
		
		result += "\n Name: " + this.getName();
		result += "\n Cedula: " + this.cedula;
		
		return result;
	}
	
}
