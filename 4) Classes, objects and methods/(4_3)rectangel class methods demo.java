class Rectangle
{
	double x,y,width,height;
	Rectangle()
	{
		x=0;
		y=0;
		width=1;
		height=1;
	}
	Rectangle(int x,int y,int width,int height)
	{
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	double getArea()
	{
		return width*height;
	}
	double getPerimeter()
    {
        return 2 * (width + height);
    }
}
class RecObj
{
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(1,4,5,2);
		System.out.println("Default Reactangle ...");
		System.out.println("Area : "+r1.getArea()+" m^2");
		System.out.println("Perimeter : "+r1.getPerimeter()+" m");
		System.out.println("\n\nUser specified Rectangle ...");
		System.out.println("Area : "+r2.getArea()+" m^2");
		System.out.println("Perimeter : "+r2.getPerimeter()+" m");
	}
}