class StringDemo
{
	public static void main(String[] args) {
		String s1="Programming";
		System.out.println("length : "+s1.length());
		System.out.println("Printing the second half of string ..");
		for(int i=(s1.length())/2;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
		}
	}
}