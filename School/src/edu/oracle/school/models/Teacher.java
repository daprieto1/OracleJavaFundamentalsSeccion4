package edu.oracle.school.models;

import java.util.Date;

public class Teacher extends Person {

	private String[] cursos;

	public Teacher(String name, char genere, long cedula, Date birthDate) {
		super(name, genere, cedula, birthDate);
	}

	public Teacher(String[] cursos) {
		this.cursos = cursos;
	}

	public void printCourses() {

		for (int i = 0; i < this.cursos.length; i++) {
			System.out.println("Curso " + (i + 1) + ": " + cursos[i]);
		}

	}
}
