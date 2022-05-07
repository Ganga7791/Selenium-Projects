package weektwo.daytwo;

import java.util.Scanner;

public class FactorialValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=num;i++)
        {
        	factorial = factorial*i;
        }
        System.out.println("Factorial of the number: "+factorial); 
     }  
}
