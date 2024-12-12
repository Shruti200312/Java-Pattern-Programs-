class Program151
{
	public static void main(String args[])
	{
		int a=90,b=80,c=70,d=60,e=50;
		
		if(a>b)
			if(a>c)
				if(a>d)
					if(a>e)
						System.out.println("a is bigger");
					else
						System.out.println("e is bigger");
				else
					if(d>e)
						System.out.println("d is bigger");
					else
						System.out.println("e is bigger");
			else
				if(c>d)
					if(c>e)
						System.out.println("c is bigger");
					else
						System.out.println("e is bigger");
				else
					if(d>e)
						System.out.println("d is bigger");
					else
						System.out.println("e is bigger");
		else
			if(b>c)
				if(b>d)
					if(b>e)
						System.out.println("b is bigger");
					else
						System.out.println("e is bigger");
				else
					if(d>e)
						System.out.println("d is bigger");
					else
						System.out.println("e is bigger");
			else
				if(c>d)
					if(c>e)
						System.out.println("c is bigger");
					else
						System.out.println("e is bigger");
				else
					if(d>e)
						System.out.println("d is bigger");
					else
						System.out.println("e is bigger");
		

						
				
	}
}