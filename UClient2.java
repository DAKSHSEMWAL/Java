import java.io.*;
import java.net.*;
public class UClient2
{
  public static void main(String[] args)throws Exception
  {
	String s;
	DatagramSocket cs=new DatagramSocket();
	byte senddata[]=new byte[1024];
	InetAddress ip=InetAddress.getByName("localhost");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a message:");
	s=br.readLine();
	senddata=s.getBytes();
	DatagramPacket dp=new DatagramPacket(senddata,senddata.length,ip,6666);
	cs.send(dp);
	cs.close(); 
  }
}
