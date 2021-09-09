package IO;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterBufferEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		try
		{
			FileWriter fw=new FileWriter("characterbuffer.txt");
			BufferedWriter bfw=new BufferedWriter(fw);
			bfw.write(s);
			bfw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("-------------");
		try {
			FileReader fr=new FileReader("characterbuffer.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
