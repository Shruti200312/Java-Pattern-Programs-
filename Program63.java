/*
54321
-5432
--543
---54
----5
*/

class Program63
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}