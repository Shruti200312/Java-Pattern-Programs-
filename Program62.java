/*
----1
---21
--321
-4321
54321
*/

class Program62
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

