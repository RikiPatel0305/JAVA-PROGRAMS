class RangeException extends Exception
{
	String r;
	RangeException()
	{
		r="Range Exception : Number should be between 0 and 1";
	}
	public String toString()
	{
		return r;
	}
}
class AddDemo
{
	public static void main(String[] args) {
		String a[]={"0.4","1.12","0.90","0.321","0.1"};
		add(a);
	}
	static void add(String[] a)
	{
		double b[]=new double[5];
		
		try
		{
				for(int i=0;i<a.length;i++)
				{

					b[i]=Double.parseDouble(a[i]);
					if(b[i]>1 || b[i]<0)
					{
						throw new RangeException();
					}

				}
				double x=0;
				for(int i=0;i<b.length;i++)
				{
					x=x+b[i];
				}
				
				System.out.println("Addition of array :"+x);
			
		}
		catch(RangeException re)
		{
			System.out.println(re);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}
	}
}