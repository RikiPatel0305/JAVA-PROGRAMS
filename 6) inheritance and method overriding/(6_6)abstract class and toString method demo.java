import java.lang.*;
abstract class Fruit
{
	String color;	
}
class Apple extends Fruit
{
	Apple()
	{
		this.color="Red";
		
	}
	public String toString()
	{
		Class obj=this.getClass();
		return obj.getSuperclass().getName()+" : "+obj.getName()+" : "+this.color;
	}
}
class Banana extends Fruit
{
	Banana()
	{
		this.color="Yellow";
		
	}
	public String toString()
	{
		Class obj=this.getClass();
		return obj.getSuperclass().getName()+" : "+obj.getName()+" : "+this.color;
	}
}
class Orange extends Fruit
{
	Orange()
	{
		this.color="Orange";
		
	}
	String display()
	{
		Class obj=this.getClass();
		return obj.getSuperclass().getName()+" : "+obj.getName()+" : "+this.color;
	
	}
}
class Strawberry extends Fruit
{
	Strawberry()
	{
		this.color="pink";
		
	}
	String display()
	{
		Class obj=this.getClass();
		return obj.getSuperclass().getName()+" : "+obj.getName()+" : "+this.color;
	
	}
}
class FruitDemo
{
	public static void main(String[] args) {
		Apple a=new Apple();
		Banana b=new Banana();
		Orange o=new Orange();
		Strawberry s=new Strawberry();
		// Class obj=a.getClass();
		// System.out.println(obj.getName());
		System.out.println(a);
		System.out.println(b);
		System.out.println(o.display());
		System.out.println(s.display());


	}
}