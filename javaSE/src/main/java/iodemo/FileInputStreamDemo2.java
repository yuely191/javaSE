package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo2 {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("d:\\test.txt");
		
		int len=fis.available();
		int s=0;
		byte[] by=new byte[20];
		//byte[] by=new byte[len];
		
		while(-1 !=(s=fis.read(by))) {
			System.out.print(new String(by,0,s));
		}
		

		
	}

}
