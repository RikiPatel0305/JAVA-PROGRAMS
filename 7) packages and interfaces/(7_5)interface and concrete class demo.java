package tents;
interface WaterProof
{

}
abstract class Tent
{
	abstract void property();
}
class TentA extends Tent
{
	void property()
	{
		System.out.println("TentA is not Waterproof");
	}
}
class TentB extends Tent implements WaterProof
{
	void property()
	{
		System.out.println("TentB is Waterproof");
	}
}
class TentC extends Tent
{
	void property()
	{
		System.out.println("TentC is not Waterproof");
	}
}
class TentD extends Tent implements WaterProof
{
	void property()
	{
		System.out.println("TentD is Waterproof");
	}
}
class TentDemo
{
	public static void main(String[] args) {
		Tent[] t=new Tent[4];
		t[0]=new TentA();
		t[1]=new TentB();
		t[2]=new TentC();
		t[3]=new TentD();
		for(int i=0;i<4;i++)
		{
			if(t[i] instanceof WaterProof)
				t[i].property();
		}

	}
}