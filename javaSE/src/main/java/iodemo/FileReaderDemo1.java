package iodemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
	
	public static void main(String[] args) {
		FileReader fr=null;
		char[] ch=new char[5];
		int len;
		try {
			fr=new FileReader("demo.txt");
			while(-1 !=(len=fr.read(ch))) {
				System.out.print(len);
				System.out.print(new String(ch,0,len));
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
