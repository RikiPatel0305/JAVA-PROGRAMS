import java.util.Arrays;
class CmdLineSorting
{
	public static void main(String[] s) {
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(a);
		System.out.printf("Sorted array : %s ",Arrays.toString(a));
	}
}