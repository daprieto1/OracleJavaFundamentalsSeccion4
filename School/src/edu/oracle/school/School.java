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

		/*int grade1;
		System.out.println("Ingrese nota 1");
		grade1 = sc.nextInt();

		int grade2;
		System.out.println("Ingrese nota 1");
		grade2 = sc.nextInt();

		int grade3;
		System.out.println("Ingrese nota 1");
		grade3 = sc.nextInt();

		double average = (double)(grade1 + grade2 + grade3) / 3;
		System.out.println("El promedio es: " + average);*/
		
		
		System.out.println("¿Cuántas notas desea ingresar?");
		//int numGrades= sc.nextInt();
		int grade = 0;
		for(int i = 0; true; i++) {			
			System.out.println("Ingrese nota " + (i + 1) + ": ");
			//grade += sc.nextInt();
		}
		//System.out.println("El promedio es: " + (double)grade/numGrades);
		
		
		
		
		
		/*
		int grade = 0;
		char moreGrades = 'Y';
		int numGrades = 0;
		while(moreGrades == 'Y') {
			numGrades++;
			System.out.print("Ingrese nota " + (numGrades) + ": ");
			grade += sc.nextInt();
			
			sc.nextLine();
			System.out.println("¿Desea ingresar más notas?");
			moreGrades = sc.nextLine().charAt(0);
		}
		System.out.println("El promedio es: " + (double)grade/numGrades);
		
		*/
		
		
		
		
		
		
		
		
		

	}

}
