/*
eeeee
-dddd
--ccc
---bb
----a
*/

class Program77
{
	public static void main(String args[])
	{
		for(char i='e';i>='a';i--)
		{
			for(char j=i;j<'e';j++)
			{
				System.out.print(" ");
			}
			for(char k=i;k>='a';k--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}