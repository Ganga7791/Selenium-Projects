package weektwo.daytwo;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		   int num1,num2, result;
		   Scanner sobj = new Scanner(System.in);  
	       
		   System.out.println("Enter the first integer number: ");  
	       num1 = sobj.nextInt();
	       
	       System.out.println("Enter the second integer number: ");  
	       num2 = sobj.nextInt();
	         
	       System.out.println("Enter any one Arithmetic Operation add, sub, multiply or divide  "); 
	       
		      String text = sobj.next(); 
		      
		      switch(text) {
		      case "add":
		    	  result = num1 + num2;
		    	  System.out.println("Addition of " +num1+ " and " +num2+ " is " +result);
		    	  break;
		      case "sub":
		    	  result = num1 - num2;
		    	  System.out.println("Subtract of " +num1+ " and " +num2+ " is " +result);
		    	  break;
		      case "multiply":
		    	  result = num1 * num2;
		    	  System.out.println("Multiply of " +num1+ " and " +num2+ " is " +result);
		    	  break;	  
		      case "divide":
		    	  result = num1 / num2;
		    	  System.out.println("Divide of " +num1+ " and " +num2+ " is " +result);
		    	  break;
		      default:
		    	  System.out.println("Invalid entry");
		          break;
		      }
	}
}
