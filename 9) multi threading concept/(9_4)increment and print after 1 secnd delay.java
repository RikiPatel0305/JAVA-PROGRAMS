class SecThrd implements Runnable
{
	int v;
	SecThrd(int v)
	{
		this.v=v;
	}
	public void run()
	{
		while(true)
		{
			System.out.println(this.v);
			v++;
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException i)
			{
				System.out.println(i);
			}
		}
	}
}
class ValueAfter1Sec
{
	public static void main(String[] args) {
		SecThrd s=new SecThrd(5);
		Thread t=new Thread(s);
		t.start(); 
	}
}