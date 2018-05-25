package filedemo;

import java.io.File;

public class FileDemo3 {
	
	public static void main(String[] args) {
		File file=new File("d:\\");
		
		File[] files=file.listFiles();
		
		for(File f:files) {
			System.out.println(f.getName());
		}
	}

}
