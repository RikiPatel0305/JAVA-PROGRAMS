import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
class StudentManagerProgram3
{
	public static void main(String[] args) {
		System.out.println("writing data into file name student2.txt...");
		try
		{
			FileOutputStream out=new FileOutputStream("student2.txt");
			DataOutputStream dataOutput=new DataOutputStream(out);
			String str="Name : Rikin\nNo : 170010107035";
			byte b[]=str.getBytes();
			dataOutput.writeChars(str);
			dataOutput.close();
			System.out.println("write succesful...");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Retriving data from file ...");
		try
		{
			FileInputStream in=new FileInputStream("student2.txt");
			DataInputStream dataInput=new DataInputStream(in);
			int i=0;
			char ss;
			while(dataInput.available() > 0)
			{
				ss=dataInput.readChar();
				System.out.print(ss);
			}
			dataInput.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}