package iodemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class KeyInputStreamDemo2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=
				new BufferedReader(new InputStreamReader(new FileInputStream("demo.txt")));
	
		BufferedWriter bw=
				new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line=null;
		while(null !=(line=br.readLine())) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
	}

}
