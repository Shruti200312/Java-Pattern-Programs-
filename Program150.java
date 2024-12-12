class Program150
{
	public static void main(String args[])
	{
		int a=10,b=20,c=30,d=40;
		
		String result=(a>b)?(a>c)?(a>d)?"a is greater":"d is greater":
				(c>d)?"c is greater":"d is greater":
				(b>c)?(b>d)?"b is greater":"d is greater":
				(c>d)?"c is greater":"d is greater";

		System.out.println(result);		
	}
}
