package assignment;
import java.util.Scanner;


public class Assignment2 {
	double mealPrice;
	int tipPercent;
	int taxPercent;
	double totalCostPayable;
 
	public void Total(){
		
		Scanner S=new Scanner(System.in);
		
		   System.out.println("Enter Meal Price");  	
				double mealPrice =S.nextDouble();
			System.out.println("Enter Tip Percentage");
				int tipPercent =S.nextInt();	
			System.out.println("Enter Tax Percentage");  	
				int taxPercent =S.nextInt();
				
			totalCostPayable = mealPrice + (tipPercent * mealPrice/100) + (taxPercent* mealPrice/100);
			System.out.println("Total Amount Payable: " + totalCostPayable); 
		S.close();
	}
	
	public static void main (String[]args){
			
		Assignment2 A = new Assignment2();
		A.Total();
		
	}
	
	
}
