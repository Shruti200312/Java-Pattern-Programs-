/*
AbCdE
 bCdE
  CdE
   dE
    E
   dE
  CdE
 bCdE
AbCdE

*/

class Program312
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n*2-1;i++)
		{
			if(i<=n)
			{
				for(int j=i;j>1;j--)
					System.out.print(" ");
				for(int j=i;j<=n;j++)
					System.out.print((j%2==0)?(char)(j+96):(char)(j+64));	
			}
			else
			{
				for(int j=i;j<n*2-1;j++)
					System.out.print(" ");
				for(int j=n*2-i;j<=n;j++)
					System.out.print((j%2==0)?(char)(j+96):(char)(j+64));
			}
			System.out.println();
		}
	}
}