/*
AAAAA
-BBBB
--CCC
---DD
----E
*/

class Program76
{
	public static void main(String args[])
	{
		for(char i='A';i<='E';i++)
		{
			for(char j=i;j>'A';j--)
			{
				System.out.print(" ");
			}
			for(char k=i;k<='E';k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}