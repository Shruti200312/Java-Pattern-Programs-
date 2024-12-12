class Program180
{	
	public static void main(String args[])
	{
		int a=10,b=20,c=100,d=40,e=50;

		String result=(a>b)?(a>c)?(a>d)?(a>e)?"a is greater":"e is greater":
				(d>e)?"d is greater":"e is greater":
				(c>d)?(c>e)?"c is greater":"e is greater":
				(d>e)?"d is greater":"e is greater":
				(b>c)?(b>d)?(b>e)?"b is greater":"e is greater":
				(d>e)?"d is greater":"e is greater":
				(c>d)?(c>e)?"c is greater":"e is greater":
				(d>e)?"d is greater":"e is greater";
	

				System.out.print(result);
	}
}
