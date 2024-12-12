/*
    A
   bb
  CCC
 dddd
EEEEE
 dddd
  CCC
   bb
    A  
*/

class Program206
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((i%2==0)?(char)(i+96):(char)(i+64));
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((i%2==0)?(char)(i+96):(char)(i+64));
			}
			System.out.println();
		}

	}
}