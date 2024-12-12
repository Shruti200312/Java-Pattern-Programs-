/*
ABCDE
-ABCD
--ABC
---AB
----A
*/

class Program78
{
	public static void main(String args[])
	{
		for(char i='E';i>='A';i--)
		{
			for(char j=i;j<'E';j++)
			{
				System.out.print(" ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}