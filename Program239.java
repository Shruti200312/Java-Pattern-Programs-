/*
E
dE
CdE
bCdE
AbCdE
bCdE
CdE
dE
E
*/

class Program239
{
	public static void main(String args[])	
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			for(int j=(n-i)+1;j<=n;j++)
				if(j%2==0)
					System.out.print((char)(j+96));
				else
					System.out.print((char)(j+64));
			else
			for(int j=(i-n)+1;j<=n;j++)
				if(j%2==0)
						System.out.print((char)(j+96));
					else
						System.out.print((char)(j+64));
			System.out.println();
		}
	}
}

	
