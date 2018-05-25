package filedemo;

import java.io.File;
import java.io.FilenameFilter;

public class FilterDemo2 {
	
	public static void main(String[] args) {
		File file=new File("d:\\");
		String[] files=file.list(new FilterByName());
		for(String f:files) {
			System.out.println(f);
		}
	}

}


class FilterByName implements FilenameFilter{
	
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".txt");
	}
}