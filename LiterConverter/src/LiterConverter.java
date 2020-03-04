import java.util.Scanner;

public class LiterConverter {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Ask for the number of gallons
		double gallons = scanner.nextDouble();
		
		// Convert gallons to liters
		double liters = gallons * 3.785;
		
		// Write the liters
		System.out.println(gallons + " gallons is equivalent to " + liters + " liters");
	}

}
