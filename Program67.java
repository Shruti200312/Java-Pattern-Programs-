/*
----5
---45
--345
-2345
12345
*/

class Program67
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
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