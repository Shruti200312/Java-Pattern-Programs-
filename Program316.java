/*
*****
*  *
* *
**
*
*/

class Program316
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
				if(i==1||j==i||j==n||j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
}