package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteCopyDemo1 {

		public static void main(String[] args) throws IOException {
			FileInputStream fis=
					new FileInputStream("D:\\ѧϰ����\\01linux������Ƶ\\�γ���Ƶ\\01-�γ̰���.mp4");
			int len=fis.available();
			byte[] by=new byte[len];
			FileOutputStream fos=new FileOutputStream("d:\\ubantu.mp4");
			
			while(-1 !=(len=fis.read(by))) {
				fos.write(by);
				
				System.out.println(len);
			}
			fis.close();
			fos.close();
		}
}
