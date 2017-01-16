package assignment;

import java.util.Scanner;

public class Assignment8 {
	int n;
	public void Prime()
	{
		Scanner S=new Scanner(System.in);
		  System.out.print("Enter any number: ");  	
				int x =S.nextInt();
	S.close();
	
	for (int i = 2; i <= x;)
	{
		if (x%i == 0)
		{
		    x=x/i;	
		    System.out.println(i);
		}
		else 
		{
			i++;
		}
		
	}
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment8 P = new Assignment8();
		P.Prime();
		
	}

}
