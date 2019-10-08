import java.util.Scanner;
class ConVow
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int c=0,v=0,b=0;
		for(int i=0;i<s.length();i++)
		{
			char check=s.charAt(i);
			if(check=='A'||check=='E'||check=='I'||check=='O'||check=='U'||check=='a'||check=='e'||check=='i'||check=='o'||check=='u')
				{v++;}
			else if(check==' ')
				{
					b++;
				}
			else
				c++;
		}
		System.out.println("Consonents : "+c+"\nVowels : "+v);
	}
}