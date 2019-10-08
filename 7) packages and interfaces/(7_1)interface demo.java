interface LO 
{
	public abstract void lightOn();
	public abstract void lightOff();
}
class SO
{
	void switchOn()
	{
		System.out.println("switch is on");
	}
	void switchOff()
	{
		System.out.println("switch is off");
	}
}
class CONE extends SO
{

}
class CUBE extends SO
{

}
class LC extends CONE implements LO
{
	public void lightOn()
	{
		System.out.println("Light is on");
	}
	public void lightOff()
	{
		System.out.println("Light is off");
	}
}
class LCB extends CUBE implements LO
{
	public void lightOn()
	{
		System.out.println("Light is on");
	}
	public void lightOff()
	{
		System.out.println("Light is off");
	}

}
class LightDemo
{
	public static void main(String[] args) {
		LO l1;
		LC c1=new LC();
		l1=c1;
		LO l2;
		LCB c2=new LCB();
		l2=c2;
		c1.switchOn();
		l1.lightOn();
		c2.switchOff();
		l2.lightOff();
	}
}
