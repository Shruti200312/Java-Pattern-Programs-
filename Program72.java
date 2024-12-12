/*
11111
-2222
--333
---44
----5
*/

class Program72
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
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
		