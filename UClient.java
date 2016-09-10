import java.io.*;
import java.net.*;
public class UClient 
{

	public static void main(String[] args) throws Exception
	{
		String s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter p:");
		s=br.readLine();
		DatagramSocket cs=new DatagramSocket();
		InetAddress ip=InetAddress.getByName("localhost");
		byte senddata[]=new byte[1024];
		senddata=s.getBytes();
		DatagramPacket dp=new DatagramPacket(senddata,senddata.length,ip,2525);
		System.out.println("Enter r:");
		s=br.readLine();
		byte senddata1[]=new byte[1024];
		senddata1=s.getBytes();
		DatagramPacket dp1=new DatagramPacket(senddata1,senddata1.length,ip,2525);
		System.out.println("Enter t:");
		s=br.readLine();
		byte senddata2[]=new byte[1024];
		senddata2=s.getBytes();
		DatagramPacket dp2=new DatagramPacket(senddata2,senddata2.length,ip,2525);
		cs.send(dp);
		cs.send(dp1);
		cs.send(dp2);
		cs.close();
	}

}
