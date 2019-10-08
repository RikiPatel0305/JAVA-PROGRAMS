class A
{

}
class B extends A
{

}
class C extends B
{

}
class D extends C
{

}
class SuperNameDemo
{
	public static void main(String[] s) {
		int c=0;
		try
		{
			
			Class ob1=Class.forName(s[0]);
			String s1=ob1.getSuperclass().getName();
			c++;
			String s2=ob1.getSuperclass().getSuperclass().getName();
			c++;
			String s3=ob1.getSuperclass().getSuperclass().getSuperclass().getName();
			c++;
			String s4=ob1.getSuperclass().getSuperclass().getSuperclass().getSuperclass().getName();
			c++;
			String s5=ob1.getSuperclass().getSuperclass().getSuperclass().getSuperclass().getSuperclass().getName();
			c++;
		}
		catch(Exception e)
		{
			System.out.println("Number of super class : "+c);
			//System.out.println("Error : No Superclass ahead ");
		}
	}
}