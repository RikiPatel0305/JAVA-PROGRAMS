import java.util.Scanner;
class DivDemo
{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter two number : ");
		int a=ob.nextInt();
		int b=ob.nextInt();
		try
		{
			double c=a/b;
			System.out.println("Division : "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error : "+e.getMessage());
			System.out.println("Error : "+e);
		}
	}
}