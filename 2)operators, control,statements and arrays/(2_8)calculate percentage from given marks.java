import java.util.Scanner;
class Pcalculate{
	public static void main(String []s){
		int a[]=new int[6];
		Scanner s1=new Scanner(System.in);
		int i;
		float sum=0;
		System.out.println("Enter marks of Sub.");
		for(i=0;i<6;i++){
			a[i]=s1.nextInt();
		}
		for(i=0;i<6;i++){
			sum=a[i]+sum;
		}
		float per=(sum/600)*100;
		System.out.println("Percentage : "+per);
	}
}