/*
----a
---ba
--cba
-dcba
edcba
*/

class Program65
{
	public static void main(String args[])
	{
		for(char i='a';i<='e';i++)
		{
			for(char j=i;j<'e';j++)
			{
				System.out.print(" ");
			}
			for(char k=i;k>='a';k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}