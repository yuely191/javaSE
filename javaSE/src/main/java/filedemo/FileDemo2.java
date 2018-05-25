package filedemo;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;

public class FileDemo2 {

		public static void main(String[] args) throws IOException {
			File file=new File("a.txt");
			file.createNewFile();
			String name=file.getName();
			System.out.println(name);
			
			String absolutePath=file.getAbsolutePath();
			
			System.out.println(absolutePath);
			
			System.out.println(file.getPath());
			
			System.out.println(file.length());
			
			Long t=file.lastModified();
			Date date=new Date(t);
			DateFormat df=
					DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
			String time=df.format(date);
			
			System.out.println(time);
			
			System.out.println();
			System.out.println(file.delete());
			//System.out.println(System.getProperty("user.dir"));
			
			
			
		}
}
