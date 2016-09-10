import java.io.*;
import java.net.*;
public class UClient3
{
  public static void main(String[] args)throws Exception
  {
	String s;
	DatagramSocket cs=new DatagramSocket(); //to send the data
	byte senddata[]=new byte[1024];
	InetAddress ip=InetAddress.getByName("172.16.50.179");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a message:");
	s=br.readLine();
	senddata=s.getBytes();
	DatagramPacket dp=new DatagramPacket(senddata,senddata.length,ip,9999);
	cs.send(dp);
	cs.close(); //closing port
  }
}
