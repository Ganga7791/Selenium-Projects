package weektwo.daytwo;

import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scobject = new Scanner(System.in);
        System.out.print("Enter any year: \n");
        int year = scobject.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            System.out.println(+year+" is a Leap Year");
        }
        else
        {
            System.out.println(+year+" is not a Leap Year");
        }
	}

}
