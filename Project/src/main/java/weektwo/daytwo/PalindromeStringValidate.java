package weektwo.daytwo;
	
import java.util.Scanner;

public class PalindromeStringValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      Scanner in = new Scanner(System.in);   
		      System.out.println("Enter a string to check if it is a palindrome");  
		      String str = in.next();   
		      String original = str;
		      String rev = "";
		      int len = str.length();   // 4
		      for ( int i = len-1; i >= 0; i-- )  // 3 2 1 0
		      {
		    	  rev = rev + str.charAt(i);  // concat + extract
		      }
		      if (original.equals(rev))  
		         System.out.println("Yes, Entered string is a palindrome.");  
		      else  
		         System.out.println("Entered string is not a palindrome.");   
		   
	}

}
