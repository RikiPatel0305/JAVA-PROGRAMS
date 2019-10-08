interface K1
{
	int intK=1;
	void mK();
}
interface K2 extends K1
{
	void mK();
}
interface K3 extends K2
{
	void mK();
}
class U implements K3
{
	public void mK()
	{
		System.out.println(intK);
	}
}
class Demo3
{
	public static void main(String[] args) {
		U u=new U();
		u.mK();
	}
}