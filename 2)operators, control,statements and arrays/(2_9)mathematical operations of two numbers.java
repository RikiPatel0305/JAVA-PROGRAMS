import java.util.Scanner;
class MathsOperation{
	public static void main(String s[]){
		Scanner s1=new Scanner(System.in);
		int a,b,c,o=0;
		System.out.println("Enter Two Number : ");
		a=s1.nextInt();
		b=s1.nextInt();
		do{System.out.println("Enter choice : \n1)Add \n2)Mul \n3)Division \n0)close");
		c=s1.nextInt();
		switch(c){
			case 1:
			o=a+b;
			System.out.println("Addition : "+o);
			break;
			case 2:
			o=a*b;
			System.out.println("Mul : "+o);
			break;
			case 3:
			o=a/b;
			System.out.println("Division : "+o);
			break;
			default:
			System.out.println("not found");

		}}while(c!=0);
	
	}
}