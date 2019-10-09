import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
class StudentManagerProgram2
{
	public static void main(String[] args) {
		System.out.println("writing data using bufferedwriter into file name student1.txt...");
		try
		{
			FileWriter fw=new FileWriter("student1.txt");
			BufferedWriter writebuffer=new BufferedWriter(fw);
			String str="Name : Rikin\nNo : 170010107035";
			byte b[]=str.getBytes();
			writebuffer.write(str);
			writebuffer.close();
			System.out.println("write succesful...");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Retriving data using bufferedreader from file ...");
		try
		{
			FileReader fr=new FileReader("student1.txt");
			BufferedReader readbuffer=new BufferedReader(fr);
			int i=0;
			while((i=readbuffer.read())!=-1)
			{
				System.out.print((char)i);
			}
			readbuffer.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}