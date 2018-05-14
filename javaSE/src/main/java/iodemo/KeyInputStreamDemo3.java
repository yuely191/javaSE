package iodemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class KeyInputStreamDemo3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw=
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream("demo.txt")));
		
		
		String line=null;
		while(null !=(line=br.readLine())) {
			bw.write(line.toUpperCase());
			bw.newLine();
			bw.flush();
		}
	}

}
