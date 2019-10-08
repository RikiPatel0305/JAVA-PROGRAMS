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
		super.display();
		System.out.println("B");
	}

}
class C extends B
{
	void display()
	{
		super.display();
		System.out.println("C");
	}

}
class InherDemo2
{
	public static void main(String[] args) {
		C c=new C();
		c.display();


	}
}