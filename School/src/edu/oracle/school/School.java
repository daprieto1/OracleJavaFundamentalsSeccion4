package edu.oracle.school;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Stack;

import edu.oracle.school.models.*;

public class School {
	
	public static void main(String args []) {
		Person p = new Person("Jorge",'m',12345,new Date(1993,12,23));
		Student s1 = new Student("Pedro", 'm', 78234, new Date(2002,3,23));
		Student s2 = new Student("José", 'm', 78234, new Date(2002,3,23), 75, 3, 3000, new String[][] {{"Matemáticas"}});
		
		
		
		LocalDate fecha = LocalDate.now();		
		System.out.println(fecha.toString());
		System.out.println(fecha);
		System.out.println(p);
		System.out.println(s1);
		
		
		
		
	}
	
}
