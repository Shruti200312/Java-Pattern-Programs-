/*
EdCbA
 EdCb
  EdC
   Ed
    E
*/
class Program169
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				/*System.out.print(j%2==0?(char)(j+96):(char)(j+64));*/

				if(j%2!=0)
					System.out.print((char)(j+64));
				else
					System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}