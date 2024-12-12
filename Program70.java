/*
----E
---ED
--EDC
-EDCB
EDCBA
*/

class Program70
{
	public static void  main(String args[])
	{
		for(char i='E';i>='A';i--)
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
