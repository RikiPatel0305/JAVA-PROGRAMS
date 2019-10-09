class AddThread implements Runnable
{
	static int count=0;
	static int add=0;
	int c=0;
	public void run()
	{
		synchronized(this)
		{
			for(int i=1;i<=25;i++)
			{
				add=add+i+count;

				if(count==75 && i==25)
				{
					c=1;
				}
			}
			count=count+25;
			if(c==1)
				System.out.println(add);
		}
	}
}
class AdditionUsing4Thread
{
	public static void main(String[] args) {
		AddThread a=new AddThread();
		Thread[] t=new Thread[4];
		for(int i=0;i<4;i++)
		{
			t[i]=new Thread(a);
			t[i].start();
			try
			{
				t[i].join();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}