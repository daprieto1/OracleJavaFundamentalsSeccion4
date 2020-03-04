package edu.oracle.converter;

import java.util.Scanner;

public class Converter {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//Pedir el numero de galones a convertir
		System.out.println("Ingrese el numero de galones: ");
		Double galones = sc.nextDouble();
		
		//convertir los galones a litros
		Double litros = galones * 3.78541;
		
		//imprimir el resultado
		System.out.println("La cantidad de " + galones + " galones son " + litros + " litros");
	}
}
