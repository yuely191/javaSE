package iodemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCopyDemo1 {
	
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("demo.txt");
		FileWriter fw=new FileWriter("D:\\123.txt");
		
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String line;
		
		while(null !=(line=br.readLine())) {
			bw.write(line);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

}
