package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterReaderEx {

	public static void main(String[] args) {
		try {
			String s="Hii this is vas";
			FileWriter fw=new FileWriter("characterEx.txt");
			fw.write(s);
			System.out.println("Written");
			fw.close();
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("---------------");
		FileReader fr;
		try
		{
			fr=new FileReader("characterEx.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
