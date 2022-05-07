package weektwo.daytwo;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter your number : ");
	      int x, sum = 0;
	      x = scan.nextInt();
		  while(x != 0){
			sum = sum + x;
			x = scan.nextInt();
			}
			System.out.println("Sum of entered numbers is " +sum);		
	}
}
