/*
    1
   22
  333
 4444
55555
 4444
  333
   22
    1
*/

class Program200
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
				System.out.print(i);
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
				System.out.print(i);
			}
			System.out.println();
		}
	}
}