
class Xchange
{
	static char[] swap(String str,int i,int j)
	{
		char c[]=str.toCharArray();
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		return c;
	}
	public static void main(String[] args) {
		String s1="Rikin";
		System.out.println("Given String : "+s1);
		System.out.print("Asked String : ");
		System.out.println(swap(s1,0,s1.length()-1));


	}
}