import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

class WriteThread implements Runnable
{
	public void run()
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("writing Thread..");
		System.out.println("Name of file in which u want to write data :");
		String wf=scan.nextLine();
		try
		{
			FileOutputStream out=new FileOutputStream(wf);
			String str="Name : Rikin Patel\nNo : 170010107035";
			byte b[]=str.getBytes();
			out.write(b);
			out.close();
			System.out.println("write succesful...");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		ReadThread rt=new ReadThread();
		Thread read=new Thread(rt);
		read.start();
	}
}
class ReadThread implements Runnable
{
	public void run()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Reading Thread ...");
		System.out.println("Name of file from which u want to retrive data :");
		String rf=scan.nextLine();
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

class StudentManagerProgram4
{
	public static void main(String[] args) {
		WriteThread wt=new WriteThread();
		
		Thread write=new Thread(wt);
		
		write.start();
		try{
		write.join();
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}

		
	}
}