import java.util.Scanner;
class Capital
{
	public static void main(String[] args) {
		String s1=new String();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string : ");
		s1=scan.nextLine();
		int len=s1.length();
		int c=0;
		String[] words=s1.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(words[i].charAt(0) >= 65 && words[i].charAt(0) <= 90)
				c++;
			
		}
		System.out.println(c+" words are starting with capital letters..");
	}
}