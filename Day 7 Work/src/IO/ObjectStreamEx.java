package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamEx {

	public static void main(String[] args) {
		
		
		student s1 = new student(65,"vas","Tamilnadu");
	   	student s2 = new student(75,"jas","Tamilnadu");
		
		try {
			FileOutputStream fos=new FileOutputStream("Student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			
			System.out.println("objects written to file");
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream fis =new FileInputStream("Student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			student s=null;
			while((s=(student) ois.readObject())!=null)
			{
				System.out.println(s);
			}
			
			
			
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
