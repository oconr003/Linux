package ciAssessment;

import java.util.Scanner;

public class Calculations {
		

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your first number: ");
		double input1 = scanner.nextInt();
		System.out.println("Please enter your second number: ");
		double input2 = scanner.nextInt();
		
	    
		boolean hasUserQuit = false;
		
			do {
	    			System.out.println("Thank you. Please choose from the following options: ");
	    			System.out.println("Please enter 1 for addition.");
	    			System.out.println("Please enter 2 for subtraction.");
	    			System.out.println("Please enter 3 for multiplication.");
	    			System.out.println("Please enter 4 for division.");
	    			System.out.println("Enter Q for quit.");
		
	    			String calOption = scanner.next();
	    			
	    			switch(calOption) {
	    				case "1":
	    					addition(input1, input2);
	    					break;
	    				case "2":
	    					subtraction(input1, input2);
	    					break;
	    				case "3":
	    					multiplication(input1,input2);
	    					break;
	    				case "4":
	    					division(input1, input2);
	    					break;
	    				case "Q":
	    					hasUserQuit = true;
	    					break;
	    			} 
	    		} 		while (!hasUserQuit); 
		}

	
	public static double addition(double input1, double input2) {
		
		double sumOfInputs;
		
		sumOfInputs = (input1 + input2);		
		System.out.println(sumOfInputs);
		
		return sumOfInputs;
	}
	
	public static double subtraction(double input1, double input2) {
		
		double subOfInputs;
		
		subOfInputs = (input1 - input2);
		System.out.println(subOfInputs);
		
		return subOfInputs;
		
	}
	
	public static double multiplication(double input1, double input2) {
		
		double multiOfInputs;
		
		multiOfInputs = (input1 * input2);
		System.out.println(multiOfInputs);
		
		return multiOfInputs;
		
		
	}
	
	public static double division(double input1, double input2) {
		
		double divOfInputs;
		
		divOfInputs = (input1 / input2);
		System.out.println(divOfInputs);
		
		return divOfInputs;
	}

	
}
