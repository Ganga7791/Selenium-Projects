package weektwo.daytwo;

import java.util.Scanner;

public class ConditionsAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a: ");
		
		int a = sc.nextInt();
		
		//int a = 3;
		
		if(a>10) {
			
			System.out.println("a is greater than 10");
		
		} else if(a<10){
			
			System.out.println("a is less than 10");
			
		} else if(a==10){
			
			System.out.println("a is equlas to 10");
			
		}
		
		
		for(int i=1; i<=10; i++) {
			System.out.println("Good Morning");
		}
		
	/*	
		while(a>10) {
			System.out.println("I am in while loop");
			a--;
		}
		*/
		
		/*
		do {
			System.out.println("i am in do while");
			a--;
		} while(a>10);
		*/
		
		switch (a) {
		case 1:
			System.out.println("English");
			break;
		case 2:
			System.out.println("Hindi");
			break;
		case 3:
			System.out.println("Tamil");
			break;
		case 4:
			
			System.out.println("Telugu");
			break;
		default:
			System.out.println("Invalid Input ! ! ! ");
			break;
		}
		
		if(a==1) {
			System.out.println("English");
		} else if(a==2) {
			System.out.println("Hindi");
		} else if(a==3) {
			System.out.println("Tamil");
		} else if(a==4) {
			System.out.println("Telugu");
		} else {
			System.out.println("Invalid Input ! ! !");
		}
	}

}
