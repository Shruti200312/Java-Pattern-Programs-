/*
12345
-2345
--345
---45
----5
*/

class Program75
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}