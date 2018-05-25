package socketDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia=InetAddress.getLocalHost();
		
		String name=ia.getHostName();
		System.out.println(name);
		
		String adderess=ia.getHostAddress();
		
		System.out.println(adderess);
		
		System.out.println("-----------------------------");
		InetAddress ia1=InetAddress.getByName("192.168.33.40");
		
		System.out.println(ia1.getHostAddress());
		System.out.println(ia1.getCanonicalHostName());
		System.out.println(ia1.getHostName());
		System.out.println(ia1.getAddress().toString());
		
		
		
		
		
		
		
		
		
		
	}

}
