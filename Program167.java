/*
1
01
101
0101
10101
*/
class Program167
{
	public static void main(String args[])
	{
		int n=5;
	
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				/*System.out.print(j%2==0?0:1);*/

				if(j%2!=0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}
}