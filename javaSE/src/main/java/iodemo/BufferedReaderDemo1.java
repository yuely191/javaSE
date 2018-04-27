package iodemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo1 {
	
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("demo.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
/*		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());*/
		
		String line;
		while(null !=(line=br.readLine())) {
			System.out.println(line);
		}
		
	}

}
