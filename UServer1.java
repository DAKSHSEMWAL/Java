import java.net.*;
public class UServer1 
{
	public static void main(String[] args) throws Exception
	{
		String s;
		DatagramSocket ss=new DatagramSocket(5759);
		byte rdata[]=new byte[1024];
		DatagramPacket dp= new DatagramPacket(rdata,rdata.length);
		ss.receive(dp);
		s= new String(dp.getData());
		double r=Double.parseDouble(s);
		System.out.println("Radius:"+r);
		double a=3.14*Math.pow(r,2);
		double c=2*3.14*r;
		System.out.println("Circumfrence Is:"+c);
		System.out.println("Area Is:"+a);
		ss.close();
	}

}