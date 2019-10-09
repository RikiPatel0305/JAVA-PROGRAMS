import java.util.Scanner;
class VowQuit 
{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		String s;
		while(true)
		{
			System.out.print("Enter a string : ");
			s=ob.nextLine();
			if(s.equals("quit"))
				break;
			else
			{
				int v=0;
				for(int i=0;i<s.length();i++)
				{
					char check=s.charAt(i);
					if(check=='A'||check=='E'||check=='I'||check=='O'||check=='U'||check=='a'||check=='e'||check=='i'||check=='o'||check=='u')
					{v++;}
				}
				System.out.println("Vowels are : "+v);
			}
		}
	}
}