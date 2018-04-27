package iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo1 {

		public static void main(String[] args) throws IOException {
			FileWriter fw=new FileWriter("demo.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write("hehhheeeheheh");
			bw.newLine();
			bw.write("nihaonihao");
			
			bw.flush();
			bw.close();
		}
}
