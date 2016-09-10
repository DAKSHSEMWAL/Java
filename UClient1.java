import java.io.*;
import java.net.*;
public class UClient1 
{

	public static void main(String[] args) throws Exception
	{
		String s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter r:");
		s=br.readLine();
		DatagramSocket cs=new DatagramSocket();
		InetAddress ip=InetAddress.getByName("localhost");
		byte senddata[]=new byte[1024];
		senddata=s.getBytes();
		DatagramPacket dp=new DatagramPacket(senddata,senddata.length,ip,5759);
		cs.send(dp);
		cs.close();
	}

}
