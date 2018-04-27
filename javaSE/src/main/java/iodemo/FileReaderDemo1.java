package iodemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
	
	public static void main(String[] args) {
		FileReader fr=null;
		char[] ch=new char[1024];
		int len;
		try {
			fr=new FileReader("demo.txt");
			while(-1 !=(len=fr.read(ch))) {
				System.out.println(new String(ch,0,len));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
