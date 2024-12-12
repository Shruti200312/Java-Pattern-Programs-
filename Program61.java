/*
EEEEE
-DDDD
--CCC
---BB
----A
*/

class Program61
{
	public static void main(String args[])
	{
		for(char i='E';i>='A';i--)
		{
			for(char j=i;j<'E';j++)
			{
				System.out.print(" ");
			}
			for(char k=i;k>='A';k--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}		