package IO;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Piped {

	public static void main(String[] args) throws IOException {
		PipedOutputStream pos=new PipedOutputStream();
		PipedInputStream pis=new PipedInputStream();
		pos.connect(pis);
		
		Thread t1=new Thread(new Runnable() {
			public void run()
			{
				for(int i=97;i<=123;i++)
				{
					try {
						pos.write(i);
						Thread.sleep(500);
					}
					catch(IOException | InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				for(int i=97;i<=123;i++)
				{
					try {
						System.out.println(pis.read());
					}
					catch(IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
