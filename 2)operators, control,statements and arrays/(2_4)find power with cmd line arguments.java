class PowerDemo
{
	public static void main(String[] s) {
		int x=Integer.parseInt(s[0]);
		int y=Integer.parseInt(s[1]);
		int a=x;
		for(int i=0;i<y-1;i++)
		{
			a=a*x;
		}
		System.out.println("X^Y is : "+a);
	}
}