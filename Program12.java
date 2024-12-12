//Write a program to find compound interest .

class Program12
{

	public static void main(String args[])
	{
		double p=600000;
		double r=2;
		int t=1;
		int n=2;

		//compound interest formula...

		double A=p*Math.pow(1+r/n,n*t);
		System.out.println(A);

		//compound interest is amount minus principal...

		double CI=A-p;
		System.out.println(CI);
	}
}
		