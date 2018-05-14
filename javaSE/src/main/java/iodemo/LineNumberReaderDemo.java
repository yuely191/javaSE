package iodemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:\\»Ò¶È·þÎñ.txt");
		
		FileWriter fw=new FileWriter("d:\\123.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		LineNumberReader lnb=new LineNumberReader(br);
		String line=null;
		while((line=lnb.readLine()) !=null) {
			System.out.println(lnb.getLineNumber()+":"+line);
			bw.write(lnb.getLineNumber()+":"+line);
			bw.newLine();
		}
		lnb.close();
		bw.close();
		

	}

}
