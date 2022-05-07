package weektwo.daytwo;

import java.util.Scanner;

public class ArmstrongValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner objsc = new Scanner(System.in);
        System.out.println("Enter the number ");
         int num = objsc.nextInt(); 
         int temp = num;
         int digit, sum = 0;
         
         while (temp != 0) 
         {
             digit = temp % 10;
             sum = sum + digit * digit * digit;
             temp /= 10;
         }
        
        if(num == sum)
        {
            System.out.println("Yes "+num+" is an Armstrong number");
        }
        else
        {
            System.out.println(num+" is not an Armstrong number");
        }       
	}
}
