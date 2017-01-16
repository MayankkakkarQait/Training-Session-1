package assignment;

public class Assignment5 {
int i;
int j;

public void Loop(){

for(i = 1;i <= 30;i++)
{
	
for(j = 1;j <= 10;j++)
	{
	
	System.out.println(i + "*" + j +"=" + j * i );
	}
		
}	
}
public static void main (String[]args)
{
	
Assignment5 L = new Assignment5();
L.Loop();
}

}
