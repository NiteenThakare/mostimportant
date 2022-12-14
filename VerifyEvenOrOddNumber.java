package logicalProgram;

public class VerifyEvenOrOddNumber {

	public static void main(String[] args) {
		verify(4);
		verify(88);
		verify(99);
		verify(543);
		verify(900);


	}
	public static void verify(int a)
	{
		if(a%2==0)
		{
			System.out.println(+a+" is Even number ");
		}
		else
		{
			System.out.println(+a+"is odd number");
		}
	}

}
