import java.io.*;
import java.net.*;
public class UClient5
{
  public static void main(String[] args)throws IOException
  {
	String s;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Sentence: ");
	s=br.readLine();
	DatagramSocket cs=new DatagramSocket();
	InetAddress ip=InetAddress.getByName("172.16.50.179");
	byte senddata[]=new byte[1024];
	senddata=s.getBytes();
	DatagramPacket dp=new DatagramPacket(senddata,senddata.length,ip,6666);
	cs.send(dp);
	cs.close();
  }
}
