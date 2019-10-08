class A
{
	void display()
	{
		System.out.println("A");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("B");
	}

}
class C extends B
{
	void display()
	{
		System.out.println("C");
	}

}
class InherDemo
{
	public static void main(String[] args) {
		A a=new A();
	B b=new B();
	C c=new C();
	a.display();
	b.display();
	c.display();
	}
}