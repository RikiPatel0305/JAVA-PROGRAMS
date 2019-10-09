import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
class DotClassFileDisplay
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter dir : ");
		String ss=scan.nextLine();
		File dirPath=new File(ss);
		//System.out.println("------------All files------------");
		// for (File file : dirPath.listFiles()) {
		// 	//System.out.println(file.getName());
		// }
		System.out.println("Displaying all .class files...");
		File[] files=dirPath.listFiles(new FilenameFilter(){
			public boolean accept(File dir,String name){
				return name.endsWith(".class");
			}
		});
		for(File file:files)
		{
			System.out.println(file.getName());
		}
	}
}