//Write a program to swap 2 values without using 3rd variable.

class Program4
{
	public static void main(String args[])
	{

		int a=10;
		int b=20;

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}