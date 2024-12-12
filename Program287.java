/*
 EEEEEEEEE
  ddddddd
   CCCCC
    bbb
     A

*/

class Program287
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
				System.out.print(" ");
			for(int j=1;j<=((n-i+1)*2)-1;j++)
				System.out.print((i%2==0)?(char)(n-i+1+96):(char)(n-i+1+64));
			System.out.println();
		}
	}
}