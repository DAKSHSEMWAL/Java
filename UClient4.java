import java.io.*;
import java.net.*;
public class UClient4
{
  public static void main(String[] args)throws IOException
  {
	String s;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Sentence: ");
	s=br.readLine();
	DatagramSocket cs=new DatagramSocket();
	InetAddress ip=InetAddress.getByName("localhost");
	byte senddata[]=new byte[1024];
	senddata=s.getBytes();
	DatagramPacket dp=new DatagramPacket(senddata,senddata.length,ip,8888);
	cs.send(dp);
	cs.close();
  }
}
