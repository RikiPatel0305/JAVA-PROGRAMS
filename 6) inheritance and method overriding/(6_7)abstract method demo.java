import java.util.Random;
abstract class Airplane
{
	abstract int getPassengers();
	String serialnumber;

	
}
class B747 extends Airplane
{
	B747()
	{
		serialnumber=Integer.toString(c1);
		c1++;
	}
	static int c1=7471;
	int getPassengers()
	{
		Random r=new Random();
		int x=r.nextInt(150-100)+100;
		return x;
	}
	public String toString()
	{
		Class obj=this.getClass();
		return "Type : "+obj.getName()+" || Serial number: "+this.serialnumber+" || Capacity : "+this.getPassengers();
	}
}
class B757 extends Airplane
{
	B757()
	{
		serialnumber=Integer.toString(c1);
		c1++;
	}
	static int c1=7571;
	int getPassengers()
	{
		Random r=new Random();
		int x=r.nextInt(150-100)+100;
		return x;
	}
	public String toString()
	{
		Class obj=this.getClass();
		return "Type : "+obj.getName()+" || Serial number: "+this.serialnumber+" || Capacity : "+this.getPassengers();
	}
}
class B767 extends Airplane
{
	B767()
	{
		serialnumber=Integer.toString(c1);
		c1++;
	}
	static int c1=7671;
	int getPassengers()
	{
		Random r=new Random();
		int x=r.nextInt(150-100)+100;
		return x;
	}
	public String toString()
	{
		Class obj=this.getClass();
		return "Type : "+obj.getName()+" || Serial number: "+this.serialnumber+" || Capacity : "+this.getPassengers();
	}
}
class AirDemo
{
	public static void main(String[] args) {
		B747 b1=new B747();
		B757 b2=new B757();
		B767 b3=new B767();
		B757 b4=new B757();
		B747 b5=new B747();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);

	}
}