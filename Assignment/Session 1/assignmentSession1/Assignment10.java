package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment10 {
	
	
	public String[] Scanner()
	{
		Scanner S=new Scanner(System.in);
		  System.out.print("Enter any string: ");  	
				String x =S.next();
				
		String[] y = x.split("");

		for (int i = 0; i < y.length; i++)
				{	
				
			 y[i] = "";
		        for(int j=y[i].length()-1;j>=0;j--)
		        {
		            y[i]+=y[i].substring(j,j+1);
		        }
		    }
		    for(int i=0;i<y.length;i++)
		    {
		         System.out.println(y[i]);
		    }
		    System.out.println(Arrays.toString(y));
		    return y;
		     System.out.print(y[i]);
			}		
		
	
	
			
	
	public static void main(String[]args)
	{
		Assignment10 At = new Assignment10();
		At.Scanner();
	}
				
}
