class A
{
	int a;
	A(int a)
	{
		this.a=a;
		{System.out.println("A has started execution..");}
	}
	
	
	
}
class B extends A
{
	int b;
	B(int a,int b)
	{
		super(a);
		this.b=b;
		{
		System.out.println("B has started execution..");
	}
	}
}
class C extends B
{
	int c;
	C(int a,int b,int c)
	{
		super(a,b);
		this.c=c;
		{System.out.println("C has started execution..");}
	}
}
class Demo1
{
	public static void main(String[] args) {
		C c1=new C(5,3,6);
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		

	}
}