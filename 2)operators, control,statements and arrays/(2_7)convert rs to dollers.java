import java.util.Scanner;
class RtoD{
	public static void main(String s[]){
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Rupees :");
		double r=s1.nextDouble();
		double d=r/60;
		System.out.println("Doller : "+d);
	}
}