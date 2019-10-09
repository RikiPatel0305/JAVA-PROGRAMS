import java.io.File;
import java.util.Scanner;
class NumberOfFileAndSubdirectory
{
	
	public static void main(String[] args) {
		int count=0,count1=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter dir path : ");

		
		File f=new File(scan.nextLine());
		File[] files=f.listFiles();
		if(files!=null)
		for(int i=0;i<files.length-1;i++)
		{
			
			File file=files[i];

			if(file.isDirectory())
			{
				//getFile(file.getAbsolutePath());
				count1++;
			}
			else
			{
				count++;
			}

		}
		System.out.println("Files : " +count);
		System.out.println("Dir : "+count1);
	}
	
}