package iodemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
	private static final String LINE_SEPARATOR = 
								System.getProperty("line.separator");

	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("demo.txt");
			fw.write("hello java"+LINE_SEPARATOR+"!!!");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
