package edu.oracle.school;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Stack;

import edu.oracle.school.models.*;

public class School {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person("Jorge", 'm', 12345, new Date(1993, 12, 23));
		Student s1 = new Student("Pedro", 'm', 78234, new Date(2002, 3, 23));

		String[] cursos = new String[4];
		cursos[0] = "Informatica";
		cursos[1] = "Ciencias";
		cursos[2] = "matemáticas";
		cursos[3] = "Español";

		String[] cursos2 = { "Informatica", "Ciencias", "matemáticas" };

		Teacher t1 = new Teacher(cursos);
		Teacher t2 = new Teacher(cursos2);

		String[][] schedule = new String[5][8];
		// Lunes
		schedule[0][0] = "Buenos Días";
		schedule[0][1] = "Matemáticas";
		schedule[0][2] = "Matemáticas";
		schedule[0][7] = "Arte";

		// Martes
		schedule[1][0] = "Buenos Días";
		schedule[1][7] = "Arte";

		// Miercoles
		schedule[2][0] = "Buenos Días";
		schedule[2][1] = "Matemáticas";
		schedule[2][2] = "Matemáticas";
		schedule[2][7] = "Arte";

		// Jueves
		schedule[3][0] = "Buenos Días";	
		schedule[3][7] = "Arte";

		// Viernes
		schedule[4][0] = "Buenos Días";
		schedule[4][1] = "Matemáticas";
		schedule[4][2] = "Matemáticas";
		schedule[4][7] = "Arte";
		
		s1.setSchedule(schedule);
		s1.printSchedule();
		
		Object [][] multiData = new Object[3][3];
		multiData[0][0] = 1;
		multiData[0][0] = "Hola";
		multiData[0][0] = true;
		multiData[0][0] = 0.0;
	}

}
