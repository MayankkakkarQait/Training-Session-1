package assignment;

import java.util.Scanner;

public class Assignment6 {
	
int[] arr;
int temp;	
	
	public void Array()
	{
		Scanner S=new Scanner(System.in);
		  System.out.println("Enter the size of Array");  	
				int x =S.nextInt();
		
		System.out.println("Input Array Elements");
				
				int [] arr = new int [x];
				
				for (int i = 0; i < x; i++)
				{
					arr [i] = S.nextInt();
				}
				System.out.println("Array You have entered is now sorted");
S.close();				
				for (int i = 0; i < x; i++)
					for (int j = i+1; j < x; j++)
					{
						if (arr[i] > arr[j])
						{
							temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
									
					}
			
				for (int i = 0; i < x; i++)
				{
					System.out.println(arr [i]);	
					
				}
				}
				
	public static void main (String[]args)
	
	{
		Assignment6 Y = new Assignment6();
		Y.Array();
	}

}

