import java.util.Scanner;

public class Calculator_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
import java.util.Scanner;

public class Calculator_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
	        
		
		System.out.println("Welcome to the BMI");
		
		 
		  double size = 0;
	        double weight = 0;
	        double bmi = 0;
	        double rounded = 0;

	        do {
	            System.out.println("Enter your size (in meters):");
	            size = sc.nextDouble();

	            System.out.println("Enter your weight (in kilograms):");
	            weight = sc.nextDouble();

	            // Vérifie que la taille est > 0 pour éviter division par zéro
	            if (size <= 0 || weight <= 0) {
	                System.out.println("Invalid input, please enter positive values.");
	                continue; // Recommence la boucle
	            }

	            bmi = weight / (size * size);
	            rounded = Math.round(bmi * 10) / 10.0;

	            if (rounded <= 0) {
	                System.out.println("Invalid BMI calculation. Please try again.");
	            }

	        } while (rounded <= 0);

	        // Interprétation du BMI
	        if (rounded < 18.5) {
	            System.out.println("Your BMI is: " + rounded + " → underweight");
	        } else if (rounded >= 18.5 && rounded <= 24.9) {
	            System.out.println("Your BMI is: " + rounded + " → healthy");
	        } else if (rounded >= 25.0 && rounded <= 29.9) {
	            System.out.println("Your BMI is: " + rounded + " → overweight");
	        } else {
	            System.out.println("Your BMI is: " + rounded + " → considered obese");
	        }
			 
	
	       
	}
} 
 
			 
	
	       
	}
} 
 
