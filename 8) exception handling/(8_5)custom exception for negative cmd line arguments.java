class NegativeException extends Exception
{
	String n;
	NegativeException()
	{
		n="Negative Exception caught";
	}
	public String toString()
	{
		return n;
	}
}
class NegDemo
{
	public static void main(String[] a) {
		int[] x=new int[a.length];
		try
		{
			int c=0;
			for(int i=0;i<x.length;i++)
			{
				x[i]=Integer.parseInt(a[i]);
				if(x[i]<0)
					{
						c=1;
						throw new NegativeException();
						
					}
			}
			if(c==0)
			{
				System.out.println("all are positive numbers");
			}
		}
		catch(NegativeException n)
		{
			System.out.println(n);
		}
	}
}