/*
54321
-4321
--321
---21
----1
*/

class Program64
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
				System.out.print(k);
			}
			System.out.println();
		}
	}
}