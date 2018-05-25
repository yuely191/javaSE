package filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	
	public static void main(String[] args) throws IOException {
		/*File file=new File("d:"+File.separator+"a.txt");
		System.out.println(file.createNewFile());*/
		
		/*File f=new File("d:"+File.separator,"abc.txt");
		//System.out.println(f.createNewFile());
*/	
		File file=new File("d:"+File.separator);
		
		File f=new File(file,"hh.txt");
		
		System.out.println(f.createNewFile());
	}

}
