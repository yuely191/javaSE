package iodemo;

import java.io.IOException;
import java.io.InputStream;

public class KeyInputDemo {
	
	public static void main(String[] args) throws IOException {
		InputStream in=System.in;
		
		int ch=0;
		
		while(true) {
			ch=in.read();
			System.out.println(ch);
		}
	}
}
