package socketDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceDemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Ω” ’∂À∆Ù∂Ø");
		
		DatagramSocket ds=new DatagramSocket(10003);
		
		
		byte[] buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf, buf.length);
		
		
		while(true) {
			ds.receive(dp);
			
			String line=new String(dp.getData(),0,dp.getLength());
			
			if("bye".equals(line)) {
				break;
			}else {
				System.out.println(line);
			}
		}
		
		ds.close();
	}

}
