package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("d:\\test.txt");
		
		int len=0;
		
		while(-1 != (len=fis.read())) {
			System.out.print((char)len);
		}
				
	}

}
