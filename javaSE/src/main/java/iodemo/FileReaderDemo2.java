package iodemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("demo.txt");
		int ch;
		while(-1 !=(ch=fr.read())) {
			System.out.println(ch);
		}
	}
}
