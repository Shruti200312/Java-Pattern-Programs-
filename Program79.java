/*
abcde
-bcde
--cde
---de
----e
*/

class Program79
{
	public static void main(String args[])
	{
		for(char i='a';i<='e';i++)
		{
			for(char j=i;j>'a';j--)
			{
				System.out.print(" ");
			}
			for(char k=i;k<='e';k++)
			{
				System.out.print(k);
			}	
			System.out.println();
		}
	}
}