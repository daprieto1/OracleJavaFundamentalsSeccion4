package edu.oracle.school.models;

import java.util.Date;

/**
 * Clase de Estudiante del Colegio Don Bosco
 * 
 * @author diegoprietotorres
 *
 */
public class Student extends Person {

	private double grade;

	private String level;
	private int ciclo;
	private int course;

	private double montlySchoolBill;
	private String[][] schedule;

	/**
	 * Constructor de la super clase
	 * 
	 * @param name
	 * @param genere
	 * @param cedula
	 * @param birthDate
	 */
	public Student(String name, char genere, long cedula, Date birthDate) {
		super(name, genere, cedula, birthDate);
	}

	/**
	 * Constructor del Estudiante.
	 * 
	 * @param name
	 * @param genere
	 * @param cedula
	 * @param birthDate
	 * @param grade
	 * @param level
	 * @param montlySchoolBill
	 * @param schedule
	 */
	public Student(String name, char genere, long cedula, Date birthDate, double grade, String level,
			double montlySchoolBill, String[][] schedule) {
		super(name, genere, cedula, birthDate);
		this.grade = grade;
		this.montlySchoolBill = montlySchoolBill;
		this.schedule = schedule;
	}

	/**
	 * Modificadores de acceso
	 */
	public boolean setSchoolInfo(String level, int ciclo, int course) {

		if (!level.equals("primaria") && !level.equals("secundaria"))
			return false;

		if (!(ciclo == 1 || ciclo == 2))
			return false;

		if (ciclo == 1 && !(course >= 1 && course <= 3))
			return false;

		if (ciclo == 2 && !(course >= 4 && course <= 6))
			return false;

		return true;
	}

	public char getLiteralGrade(int grade) {
		return grade < 70 ? 'F' : (grade < 80 ? 'C' : (grade < 90 ? 'B' : 'A'));
	}

	public String getGradeMessage(char literalGrade) {
		/*
		 * if (literalGrade == 'A') { return "DIRECTOR: El alumno es muy bueno"; } else
		 * if (literalGrade == 'B') { return "PADRES: TIENEN UN HIJO SOBRESALIEBNTE!"; }
		 * else if (literalGrade == 'C') { return "ESTUDIANTE: USTED DEBE MEJORAR!"; }
		 * else { return "PADRES: DEBEN AYUDAR MÁS A SU HIJO!"; }
		 */

		/*
		 * return literalGrade == 'F' ? "PADRES: DEBEN AYUDAR MÁS A SU HIJO!" :
		 * (literalGrade == 'C' ? "ESTUDIANTE: USTED DEBE MEJORAR!" : (literalGrade ==
		 * 'B' ? "PADRES: TIENEN UN HIJO SOBRESALIEBNTE!" :
		 * "DIRECTOR: El alumno es muy bueno"));
		 */

		String message = "";
		switch (literalGrade) {
		case 'A':
			message = "DIRECTOR: El alumno es muy bueno";
			break;
		case 'B':
			message = "PADRES: TIENEN UN HIJO SOBRESALIEBNTE!";
			break;
		case 'C':
			message = "ESTUDIANTE: USTED DEBE MEJORAR!";
			break;
		case 'F':
			message = "PADRES: DEBEN AYUDAR MÁS A SU HIJO!";
			break;
		}
		return message;

	}

	/**
	 * Funciones públicas
	 */
	@Override
	public String toString() {
		String result = super.toString();

		result += "\n Datos de Estudiante";

		return result;
	}

}
