import java.net.*;
public class UServer3
{
  public static void main(String[] args)throws Exception
  {
	DatagramSocket ss=new DatagramSocket(9999);
	byte rdata[]=new byte[1024];
	DatagramPacket dp=new DatagramPacket(rdata,rdata.length);
	ss.receive(dp);
	String s=new String(dp.getData());
	System.out.println("Received: " +s);
	ss.close();
  }
}