class A
{
	int a;
	A()
	{
		a=1;
		{System.out.println("A has started execution..");}
	}
	
	
	
}
class B extends A
{
	int b;
	B()
	{
		b=2;
		{
		System.out.println("B has started execution..");
	}
	}
}
class C extends B
{
	int c;
	C()
	{
		c=3;
		{System.out.println("C has started execution..");}
	}
}
class Demo
{
	public static void main(String[] args) {
		C c1=new C();
		System.out.println(c1.c);
		System.out.println(c1.b);
		System.out.println(c1.a);

	}
}