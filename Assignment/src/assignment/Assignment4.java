package assignment;
import java.util.Scanner;

public class Assignment4 
{

public static void main (String[] args)
	{
	Scanner Sc = new Scanner(System.in);

 	System.out.println("Enter age");  	
	 int x =Sc.nextInt();

Sc.close();		
		
	Person p = new Person(x);
	p.amIOld();
	for(int i=0;i<12;i++)
	{
	p.yearPasses();
	}
	p.amIOld();
	 }
}


class Person
{
	int Age;
	public Person (int initialAge)
	{
		
		if (initialAge > 0)
		{
			Age = initialAge;
		}
		
		else 
		{
			Age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		
   }
	public void yearPasses()
	{
		Age++;
	}
	public void amIOld()
	{
		if (Age < 13)
		{
		System.out.println("You are young.");
		}
		else if (Age >= 12 && Age < 18 )
		{
		System.out.println("You are a teenager.");
		}
		else {
			System.out.println("You are old.");
		}
	}
	
	
}