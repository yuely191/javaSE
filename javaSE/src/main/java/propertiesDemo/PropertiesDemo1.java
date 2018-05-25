package propertiesDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {

	
	public static void main(String[] args) throws Exception {
		//propertiesDemo();
		
		//propertiesDemo2();
		
		//propertiesDemo3();
		
		propertiesDemo4();
	}
	
	
	private static void propertiesDemo4() throws IOException {
		Properties prop=new Properties();
		prop=System.getProperties();
		
		FileInputStream fis=new FileInputStream("1.txt");
		prop.load(fis);
		
		
		prop.list(System.out);
		fis.close();
		
	}


	private static void propertiesDemo3() throws IOException {
		Properties prop=new Properties();
		prop=System.getProperties();
		
		FileOutputStream fos=new FileOutputStream("1.txt");
		prop.store(fos,"haha");
		
		fos.close();
	}


	private static void propertiesDemo2() {
		Properties prop=new Properties();
		prop=System.getProperties();
		
		prop.list(System.out);
		
	}


	public static void propertiesDemo() {
		Properties prop=new Properties();
		
		prop.setProperty("zhangsan","30");
		prop.setProperty("lisi","31");
		prop.setProperty("wangwu","36");
		prop.setProperty("zhaoliu","20");
		
		System.out.println(prop);
		Set<String> str=prop.stringPropertyNames();
		for(String s:str) {
			System.out.println(s+"="+prop.getProperty(s));
		}
	}
}
