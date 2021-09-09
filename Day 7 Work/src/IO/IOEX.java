package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEX {

	public static void main(String[] args)   {
		FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream("sample.txt");
			String msg="Hii Vasumathi.";
			byte b[]=msg.getBytes();
			fos.write(b);
			System.out.println("Msg was written");
			
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("--------");
		FileInputStream fis;
		try {
			fis = new FileInputStream("sample.txt");
			//System.out.println(fis.read());
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.println((char)i);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
