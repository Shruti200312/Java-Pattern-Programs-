/*
12345
12344
12333
12222
11111
*/
class Program172
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				/*System.out.print(j>i?i:j);*/

				if(i<j)
					System.out.print(i);
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}
}

