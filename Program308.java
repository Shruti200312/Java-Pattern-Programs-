/*
AAAAA
 bbbb
  CCC
   dd
    E
   bb
  CCC
 dddd
EEEEE

*/

class Program308
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
					System.out.print((i%2==0)?(char)(i+96):(char)(i+64));
			}
			else
			{
				for(int j=i;j<n*2-1;j++)
					System.out.print(" ");
				for(int j=i;j>=n;j--)	
					System.out.print((i%2==0)?(char)(i-n+1+96):(char)(i-n+1+64));
			}
			System.out.println();
		}
	}

}			