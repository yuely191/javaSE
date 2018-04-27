package iodemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo2 {
	
	public static void main(String[] args) throws IOException {
		FileReader  fr=new FileReader("demo.txt");
		FileWriter fw=new FileWriter("D:\\HELLO.txt");
		
		char[] ch=new char[1024];
		
		int len;
		while((len=fr.read(ch)) != -1) {
			fw.write(ch, 0, len);
		}
		
		fw.flush();
		fw.close();
		
	}

}
