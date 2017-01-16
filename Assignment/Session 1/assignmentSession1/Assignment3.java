package assignment;
import java.util.Scanner;

public class Assignment3 {
 int n;
 
 public void Scanner(){
	 Scanner Sc = new Scanner(System.in);
	
	 	System.out.println("Enter value");  	
		int n =Sc.nextInt();
	Sc.close();
	
 if ( n % 2 != 0 )
	 System.out.println("Wired");
 else if ((n >= 2 && n <= 5) || n > 20)
    System.out.println("Not Weird");
 else if(n >= 6 && n <= 20)
	 System.out.println("Wired");
 }

public static void main(String[]args){
	 Assignment3 A3 = new Assignment3();
	 A3.Scanner();
	 
 }
 
 
}