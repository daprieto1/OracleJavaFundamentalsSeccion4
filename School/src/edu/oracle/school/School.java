package edu.oracle.school;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Stack;

import edu.oracle.school.models.*;

public class School {

	public static void main(String args[]) {
		Person p = new Person("Jorge", 'm', 12345, new Date(1993, 12, 23));
		Student s1 = new Student("Pedro", 'm', 78234, new Date(2002, 3, 23));

		boolean isValid = false;
		isValid = s1.setSchoolInfo("primaria", 1, 2);
		System.out.println(isValid ? "CORRECTO" : "INCORRECTO");

		System.out.println(s1.getLiteralGrade(69));
		System.out.println(s1.getLiteralGrade(79));
		System.out.println(s1.getLiteralGrade(89));
		System.out.println(s1.getLiteralGrade(99));
		
		System.out.println(s1.getGradeMessage('A'));
		System.out.println(s1.getGradeMessage('B'));
		System.out.println(s1.getGradeMessage('C'));
		System.out.println(s1.getGradeMessage('F'));

	}

}
