package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteCopyDemo1 {

		public static void main(String[] args) throws IOException {
			FileInputStream fis=
					new FileInputStream("D:\\学习资料\\01linux基础视频\\课程视频\\01-课程安排.mp4");
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
