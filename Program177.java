/*
55555
54444
54333
54322
54321
*/

class Program177
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				/*System.out.print(j>i?j:i);*/

				if(i<j)
					System.out.print(j);
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
}