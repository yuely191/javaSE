package socketDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo {

	public static void main(String[] args) throws IOException {
		
		System.out.println("发送端启动！！！");
		
		DatagramSocket ds=new DatagramSocket(8888);
		
		String str="我来也";
		
		byte[] buf=str.getBytes();
		
		DatagramPacket dp=
				new DatagramPacket(buf,buf.length,InetAddress.getLocalHost(),10002);
		ds.send(dp);
		
		ds.close();
	}

}
