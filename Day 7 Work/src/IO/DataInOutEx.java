package IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutEx {

	public static void main(String[] args) {
		try {
			FileOutputStream pos=new FileOutputStream("DataEx.txt");
			DataOutputStream dos=new DataOutputStream(pos);
			int a=98;
			float f=67.87f;
			dos.writeInt(a);
			dos.writeFloat(f);
			dos.writeChar(a);
			System.out.println("Data written ");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try {
			FileInputStream pis=new FileInputStream("DataEx.txt");
			DataInputStream dis=new DataInputStream(pis);
			int x=dis.readInt();
			float s=dis.readFloat();
			char ch=dis.readChar();
			System.out.println(x+" "+s+" "+ch);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
