package IO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IoS {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		try 
		{
			fos=new FileOutputStream("sample.txt");
			Scanner sc=new Scanner(System.in);
			String msg=sc.nextLine();
			byte b[]=msg.getBytes();
			fos.write(b);
			System.out.println("Message written in the file");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("-----------");
		try
		{
			FileInputStream fis=new FileInputStream("sample.txt");
			int i;
			System.out.println(fis.read());
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
			
		
	}

}
