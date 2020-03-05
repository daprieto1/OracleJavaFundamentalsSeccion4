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
		t1.printCourses();
		
		System.out.println();
		
		Teacher t2 = new Teacher(cursos2);
		t2.printCourses();

		// Ciencias
	}

}
