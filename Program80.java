/*
EDCBA
-EDCB
--EDC
---ED
----E
*/

class Program80
{
	public static void main(String args[])
	{
		for(char i='A';i<='E';i++)
		{
			for(char j=i;j>'A';j--)
			{
				System.out.print(" ");
			}
			for(char k='E';k>=i;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}