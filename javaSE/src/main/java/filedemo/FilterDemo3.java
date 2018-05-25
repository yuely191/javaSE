package filedemo;

import java.io.File;
import java.io.FilenameFilter;

public class FilterDemo3 {

	public static void main(String[] args) {
		File file=new File("d:\\");
		
		File[] files=file.listFiles(new SuffixFilter(".txt"));
	
		for(File f:files) {
			System.out.println(f.getName());
		}
	}

}


class SuffixFilter implements FilenameFilter{
	
	String suffix;
	
	public  SuffixFilter(String suffix) {
		this.suffix=suffix;
	}
	
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(suffix);
	}
}