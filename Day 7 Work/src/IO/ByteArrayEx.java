package IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteArrayEx {

	public static void main(String[] args) {
		FileOutputStream fos1=null;
		FileOutputStream fos2=null;
		FileOutputStream fos3=null;
		
		try {
			fos1=new FileOutputStream("File1.txt");
			fos2=new FileOutputStream("File2.txt");
			fos3=new FileOutputStream("File3.txt");
			Scanner s=new Scanner(System.in);
			ByteArrayOutputStream bout=new ByteArrayOutputStream();
			String msg=s.nextLine();
		
			byte b[]=msg.getBytes();
			bout.write(b);
			bout.writeTo(fos1);
			bout.writeTo(fos2);
			bout.writeTo(fos3);
			System.out.println("msg was written");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("-----------");
		
		byte arr[]= {67,68,69,70,71};
		ByteArrayInputStream bin=new ByteArrayInputStream(arr);
		int i;
		while((i=bin.read())!=-1)
		{
			System.out.println((char)i);
		}
		try {
			fos1.close();
			fos2.close();
			fos3.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
