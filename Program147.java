/*
				OA
			JC	NB
		FF	IE	MD
	CJ	EI	HH	LG
AO	BN	DM	GL	KK
*/

class Program147
{
	public static void main(String args[])
	{
		int n=5;
		int count1=(n*(n+1))/2;
		int count2=1;
		for(int i=n,i1=1;i>=1||i1<=n;i--,i1++)
			{
				int c1=count1;
				int c2=count2;
				for(int j=i;j>1;j--)
				{
					System.out.print("\t");
				}
				for(int j=i,j1=i1;j<=n||j1>=1;j++,j1--)
				{
					System.out.print((char)(c1+64));
					System.out.print((char)(c2+64));
					System.out.print("\t");
					c1+=j;
					c2--;
				}
				System.out.println();
				count1-=i;
				count2+=i1+1;
			}
	}
}
		