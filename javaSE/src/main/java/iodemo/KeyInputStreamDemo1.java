package iodemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class KeyInputStreamDemo1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=
				new BufferedWriter(new OutputStreamWriter(System.out));
		String line=null;
		while(null !=(line=br.readLine())) {
			if("over".equals(line)) {
				break;
			}
			else {
				bw.write(line.toUpperCase());
				bw.flush();
			}
		}
	}

}
