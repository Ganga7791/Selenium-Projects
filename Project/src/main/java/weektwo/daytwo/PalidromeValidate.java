package weektwo.daytwo;

import java.util.Scanner;

public class PalidromeValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the integer number: ");  
	       int inputnumber = sc.nextInt();
	       int remainder, reversed=0;
	       int original = inputnumber;    
	       while(inputnumber != 0) //logic
	       {
	    	  remainder=inputnumber%10;    
	          reversed=(reversed*10) + remainder;    
	          inputnumber= inputnumber/10;    
	       }    
	        if(original == reversed)    
	        System.out.println("The entered number "+original+" is a palindrome number ");    
	        else
	        System.out.println("The entered number "+original+" is not a palindrome");    
	}
}
