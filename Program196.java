/*
A
bA
CbA
dCbA
EdCbA
dCbA
CbA
bA
A
*/

class Program196
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((j%2==0)?(char)(j+96):(char)(j+64));
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((j%2==0)?(char)(j+96):(char)(j+64));
			}
			System.out.println();
		}

	}
}