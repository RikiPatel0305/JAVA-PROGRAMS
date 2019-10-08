import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) {
		String s1,rev="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string : ");
		s1=scan.nextLine();
		int len=s1.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("nothing");
	}
}