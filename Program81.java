/*
edcba
-dcba
--cba
---ba
----a
*/

class Program81
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
				System.out.print(k);
			}
			System.out.println();
		}
	}
}