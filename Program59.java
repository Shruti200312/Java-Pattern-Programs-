/*
----1
---22
--333
-4444
55555
*/

class Program59
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
				System.out.print(i);
			}
			System.out.println();
		}
	}
}