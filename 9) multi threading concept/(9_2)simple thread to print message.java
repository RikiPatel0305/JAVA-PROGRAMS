class MyThrd extends Thread
{
	public void run()
	{
		System.out.println("Hello World");
	}
}

class ThrdDemo2
{
	public static void main(String[] args) {
		MyThrd m1=new MyThrd();
		m1.start();
	}
}