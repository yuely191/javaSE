package iodemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo1 {
	
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("demo.txt");
		FileWriter fw=new FileWriter("D:\\hello.txt");
		
		int len;
		
		while(-1 !=(len=fr.read())){
			fw.write(len);
		}
		fw.flush();
		fw.close();
	}

}
