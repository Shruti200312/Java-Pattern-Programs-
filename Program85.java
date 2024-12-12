/*
15
13	14
10	11	12
6	7	8	9
1	2	3	4	5
*/

class Program85
{
	public static void main(String args[])
	{
		int n=5;  //5
		int count=(n*(n+1))/2;     //  10

		for(int i=1;i<=n;i++)    //  4<=5
		{
			int c=count;//10
			for(int j=i;j>=1;j--)    //j=i   0>=1
			{
				System.out.print(c +"\t");    //12
				c++;  //13
			}
			System.out.println();  //- -
			count-=i+1;    //  10-3-1=6
		}
	}
}
				
		