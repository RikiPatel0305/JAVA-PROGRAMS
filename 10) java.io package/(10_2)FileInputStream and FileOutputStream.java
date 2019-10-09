import java.io.FileInputStream;
import java.io.FileOutputStream;
class StudentManagerProgram1
{
	public static void main(String[] args) {
		System.out.println("writing data into file name student.txt...");
		try
		{
			FileOutputStream out=new FileOutputStream("student.txt");
			String str="Name : Rikin\nNo : 170010107035";
			byte b[]=str.getBytes();
			out.write(b);
			out.close();
			System.out.println("write succesful...");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Retriving data from file ...");
		try
		{
			FileInputStream in=new FileInputStream("student.txt");
			int i=0;
			while((i=in.read())!=-1)
			{
				System.out.print((char)i);
			}
			in.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}