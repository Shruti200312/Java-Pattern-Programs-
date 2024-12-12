/*
----e
---dd
--ccc
-bbbb
aaaaa
*/

class Program60
{
	public static void main(String args[])
	{
		for(char i='e';i>='a';i--)
		{
			for(char j=i;j>'a';j--)
			{
				System.out.print(" ");
			}
			for(char k=i;k<='e';k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}