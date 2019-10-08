import java.util.Arrays;
 
class SortStringArrayExample {
	
	public static void main(String strNames[]){
		
		
		
		
		Arrays.sort(strNames);
		
		System.out.println("String array sorted (case sensitive)");
		
		for(int i=0; i < strNames.length; i++){
			System.out.println(strNames[i]);
		}
		
		Arrays.sort(strNames);
		
		System.out.println("String array sorted (case insensitive)");
		for(int i=0; i < strNames.length; i++){
			System.out.println(strNames[i]);
		}
 
	}
}