class Findsum{
	public static void main(String s[]){
		int i,sum=0;
		System.out.println("Number divisible by 7 is : ");
		for(i=100;i<=200;i++){
			if(i%7==0){
				System.out.println(" "+i);
				sum=i+sum;
			}
		}
		System.out.println("Sum is : "+sum);
	}
}