interface Transport
{
	void deliver();
}
abstract class Animal
{
	 void doinhd()
	 {}
}
class Tiger extends Animal
{
	
	void doinhd()
	{
		System.out.println("done");
	}
}
class Camel extends Animal implements Transport
{
	public void deliver()
	{
		System.out.println("Camel is delivered");
	}
}
class Deer extends Animal
{

}
class Donkey extends Animal implements Transport
{
	public void deliver()
	{
		System.out.println("Donkey is delivered");
	}

}

class Demo4
{
	public static void main(String[] args) {
		Animal[] a=new Animal[4];
		a[0]=new Tiger();
		a[1]=new Camel();
		a[2]=new Deer();
		a[3]=new Donkey();
		// 
		for(int i=0;i<4;i++)
		{
			if(a[i] instanceof Transport)
			{
				
				Class ob=a[i].getClass();
				String n=ob.getName();
				Transport t;
				switch(n)
				{
					case "Camel":
						t=(Camel)a[i];
						t.deliver();
						break;
					case "Donkey":
						t=(Donkey)a[i];
						t.deliver();
						break;
				}
			}
		}
		
		//a[0].doinhd();
		// Camel c=new Camel();
		// c.deliver();
	}
}