/*
    E
   ED
  EdC
 EdCb
EdCbA
 EdCb
  EdC
   Ed
    E
*/

class Program256
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n*2-1;i++)
		{
			if(i<=n)
			{
				for(int j=i;j<n;j++)
					System.out.print(" ");
				for(int j=n;j>=n-i+1;j--)
					System.out.print((j%2==0)?(char)(j+96):(char)(j+64));
			}
			else
			{
				for(int j=i;j>n;j--)
					System.out.print(" ");
				for(int j=n;j>=(i-n)+1;j--)
					System.out.print((j%2==0)?(char)(j+96):(char)(j+64));
			}
			System.out.println();
		}
	}
}
