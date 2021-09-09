package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class sequenceStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis1=new FileInputStream("File1.txt");
			FileInputStream fis2=new FileInputStream("File2.txt");
			
			SequenceInputStream sis=new SequenceInputStream (fis1,fis2);
			int i;
			while((i=sis.read())!=-1)
			{
				System.out.println((char)i);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
