class Circle
{
	double x=0,y=0;
	double r;
	Circle(double r)
	{
		this.r=r;
	}
	Circle(double x,double y,double r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
	}
	double getArea()
	{
		return 3.14*r*r;
	}
}
class CircleDemo
{
	public static void main(String[] args) {
		Circle c1=new Circle(4.12);
		Circle c2=new Circle(3,1,2.12);
		System.out.println("default circle..\n");
		System.out.println("Area : "+c1.getArea());
		System.out.println("User specified circle..\n");
		System.out.println("Area : "+c2.getArea());
	}
}