package assignment;

import java.util.Scanner;

public class Assignment9
{
	
	
	public void input ()
	{
		Scanner S=new Scanner(System.in);
		  System.out.println("Enter number of rows in this array: ");  	
		  int m =S.nextInt();
		  
		  System.out.println("Enter number of columns in this array: ");  	
		  int n =S.nextInt();
		  
		  System.out.println("Input Array Elements");
		  
		  int [][] arr = new int [m][n];
		  
		  	for (int i = 0; i < m ; i++)
		  	{
		  		for (int j = 0; j < n ; j++)
		  		{
		  			arr [i][j] = S.nextInt();
		  		}
		  	}
		  	
	  	System.out.println("2D Array Enterd is : ");
		  	
		  	for (int i = 0; i < m; i++)
		  	{
		  		for (int j = 0; j < n; j++)
			  	{
					System.out.print(arr [i][j] + " ");
				}
		  		System.out.println("");
		  	}
		  	S.close();
		  	
		  	System.out.println("Spiral for above 2D Pattern is :");
		  	spiralPrint(m, n, arr);
	}
		  	
		  	
		  	public static void spiralPrint(int x, int y, int A[][])
		  	{
		  		int i,  k = 0, l = 0;
		  		
		  		x--;  y--;      
		  			while(k <= x && l <= y)
			    {
			        for(i = l; i <= y; ++i) 
			        {
			            System.out.print(A[k][i]+ " ");
			        }           
			        k++;

			        for(i = k; i <= x; ++i) 
			        {
			            System.out.print(A[i][y] + " ");
			        }
			        y--;

			        for(i = y; i >= l; --i) 
			        {
			                System.out.print(A[x][i] + " ");
			        }
			        x--;
			        
			        for(i = x; i >= k; --i) 
			        {
			            System.out.print(A[i][l] + " ");
			        }
			        l++;
			    }
	}
	
	
	public static void main(String[]args)
	{
		Assignment9 I = new Assignment9();
		I.input();
	}

}
