package socketDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSendDemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("·¢ËÍ¶ËÆô¶¯");
		
		DatagramSocket ds=new DatagramSocket(9999);
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
	
		DatagramPacket dp=null;
		String line=null;
		while(null != (line=br.readLine())) {
			byte[] buf=line.getBytes();
			dp=new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 10003);
			ds.send(dp);
		}
		ds.close();
	}

}
