/*
*****
   *
  *
 *
*****
*/

class Program320
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
				if(i==1||j==n)
					System.out.print("*");
				else
					System.out.print(" ");
					
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				if(i==1)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}

	}

}