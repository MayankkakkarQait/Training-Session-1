package assignment;

import java.util.Scanner;

public class Assignment7 {
	
	
	public void Binary()
	{
		Scanner S=new Scanner(System.in);
		  System.out.print("Enter any number: ");  	
				int x =S.nextInt();
	S.close();
	Integer in = new Integer(x);
	String binary = Integer.toBinaryString(in);
	String[] binary2 = binary.split("");
	
	int max = 0;
	int finalmax = 0;
	
	System.out.print("Binnary value is: ");
		
		for (int i = 0; i < binary2.length; i++)
	{	
			
				System.out.print(binary2 [i]);	
		
	}
		for (int i = 0; i < binary2.length; i++)
		{
			if( binary2[i].equals("1"))
			{
				 max++;
			}
			else 
			{
				max = 0;
			}
			if(max > finalmax)
			{
			finalmax = max;
			}
			
		}
		System.out.print("\n Consutive 1's are: ");
			System.out.print(finalmax);	
		
	}
	
	
	public static void main(String a[]){
		Assignment7 B = new Assignment7();	
	B.Binary();
		}
}

	
