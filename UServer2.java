import java.net.*;
public class UServer2
{
  public static void main(String[] args)throws Exception
  {
	DatagramSocket ss=new DatagramSocket(6666);
	byte rdata[]=new byte[1024];
	DatagramPacket dp=new DatagramPacket(rdata,rdata.length);
	ss.receive(dp);
	String s=new String(dp.getData());
	System.out.println("Received: " +s);
	ss.close();
  }
}
