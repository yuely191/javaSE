package socketDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceDemo {

	public static void main(String[] args) throws IOException {
		
		System.out.println("·¢ËÍ¶ËÆô¶¯£¡£¡£¡");
		
		DatagramSocket ds=new DatagramSocket(10002);
		
		byte[] buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf, buf.length);
		
		ds.receive(dp);
		
		System.out.println(new String(dp.getData(),0,dp.getLength()));
		System.out.println(dp.getLength());
		System.out.println(dp.getPort());
		System.out.println(dp.getAddress());
		
		ds.close();
	}

}
