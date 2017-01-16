package assignmentSession2;
import java.util.*;

public class ReverseString 
{
	ArrayList A = new ArrayList();
	{
		A.add("S");
		A.add("E");
		A.add("F");
		A.add("@");
		A.add("A");
		A.add("!");
		A.add("T");	
		
	}
		public void Test()
		
		{
			System.out.println(A);
				
		int q =	A.indexOf("@");
			A.remove(q);
			A.add(q, "@");
		int i =	A.indexOf("!");
			A.remove(i);
		Collections.reverse(A);	
			System.out.println(A);
		
		}
		
public static void main(String[] args) {
	
	ReverseString R = new ReverseString();
	R.Test();

	
	}

}
