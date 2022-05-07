package weektwo.daytwo;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 100;
        System.out.println("Prime numbers between 1 to 100 are :");
		
        for(int i=1;i<=max;i++)
        {
        	int counter = 0;
        	for(int j=i;j>=1;j--)
            {
        	if(i%j==0)
        	  {
        		counter = counter +1;
              }
            }
        	if (counter==2) 
        	  {
             System.out.print(i+" ");
        	  }
	        }
	     }
}

