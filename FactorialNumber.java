package logicalProgram;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		int a;
		a=factorialnumber(1);
		System.out.println("Factorial Number=>"+a);
		a=factorialnumber(6);
		System.out.println("Factorial Number=>"+a);
		a=factorialnumber(7);
		System.out.println("Factorial Number=>"+a);
		a=factorialnumber(8);
		System.out.println("Factorial Number=>"+a);
		
		
		


	}
	public static int factorialnumber(int a)
	{
		if(a==1)
		{
			return 1;
			
		}
		else
		{
			return (a*factorialnumber(a-1));
		}
	}

}
