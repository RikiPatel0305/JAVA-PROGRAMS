import java.util.Scanner;
class FindMaxMini{
	public static void main(String []s){
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter No. of Element : ");
		int n=s1.nextInt();
		System.out.println("Enter Element : "+n);
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s1.nextInt(); 
		}
		int max;
			max=arr[0];
			for(int i=0;i<n;i++)
			{
				if(max<arr[i])
					max=arr[i];
			}
			System.out.println("Maximum Element is : "+max);
		}
}
