package filedemo;

import java.io.File;
import java.io.FileFilter;

public class FilterDemo1 {

	public static void main(String[] args) {
		File file=new File("d:\\");
		File[] f=file.listFiles(new FilterByHidden());
		
		for(File s:f) {
			System.out.println(s.getName());
		}
		

	}

}

class FilterByHidden implements FileFilter{
	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		return pathname.isHidden();
	}
}
