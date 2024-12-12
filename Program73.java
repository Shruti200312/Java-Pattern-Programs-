/*
55555
-4444
--333
---22
----1
*/

class Program73
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}