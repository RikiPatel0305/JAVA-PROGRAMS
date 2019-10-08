

class absolute
{
	
	public static void main(String[] args) {
		int i=-4;
		double d=-9.00;
		float f=(float)3.6;
		findAbs(i);
		findAbs(f);
		findAbs(d);

	}
	static void findAbs(int i)
	{
		System.out.println("absolute of int "+i+" is "+Math.abs(i));
	}
	static void findAbs(float f)
	{
		System.out.println("absolute of float "+f+" is "+Math.abs(f));
	}
	static void findAbs(double d)
	{
		System.out.println("absolute of double "+d+" is "+Math.abs(d));
	}
}