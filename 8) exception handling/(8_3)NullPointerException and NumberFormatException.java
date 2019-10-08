import java.util.ArrayList;
class AvgDemo
{
	public static void main(String[] args) {
		String a[]={"2.4","1.12","5.90","1.321","8.1"};
		average(a);
	}
	static void average(String[] a)
	{
		double b[]=new double[5];
		
		try
		{
			if (a.length == 0) 
			{
				throw new NullPointerException();
			
			}
			else
			{
				for(int i=0;i<a.length;i++)
				{

					b[i]=Double.parseDouble(a[i]);

				}
				double x=0;
				for(int i=0;i<b.length;i++)
				{
					x=x+b[i];
				}
				x=x/b.length;
				System.out.println("average of array : "+x);
			}
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}
	}
}