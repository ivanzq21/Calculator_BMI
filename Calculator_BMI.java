import java.util.Scanner;

public class Calculator_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
	        
		
		System.out.println("Welcome to the BMI");
		
		 
		double size=0;
		 double weight=0;
		
			 System.out.println("Enter your size pls:");
			 size=sc.nextDouble();
			 System.out.println("Enter your weight:");
			 weight=sc.nextDouble();
			 double bmi=weight/(size*size);
			 double rounded= Math.round(bmi*10)/10.0;
			 
			 if(rounded<=0)
				 System.out.println("Invalid input, please check your value");
			 else if(rounded<18.5)
			 System.out.println("Your BMI is: "+rounded+" too low");
			 else if(rounded>=18.5 && rounded<=24.9)
				 System.out.println("Your BMI is: "+rounded+" is healthy");
			 else if(rounded>25.0 && rounded<29.9)
				 System.out.println("Your BMI is: "+rounded+" is overweight");
			 else
				System.out.println("Your BMI is: "+rounded+" is considered obese");
			 
	
	       
	}
} 
 