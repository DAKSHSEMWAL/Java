import java.net.*;
public class UServer 
{
	public static void main(String[] args) throws Exception
	{
		String s;
		DatagramSocket ss=new DatagramSocket(2525);
		
		byte rdata[]=new byte[1024];
		DatagramPacket dp= new DatagramPacket(rdata,rdata.length);
		ss.receive(dp);
		s= new String(dp.getData());
		double p=Double.parseDouble(s);
		System.out.println("Principal:"+p);
		
		byte rdata1[]=new byte[1024];
		DatagramPacket dp1= new DatagramPacket(rdata1,rdata1.length);
		ss.receive(dp1);
		s= new String(dp1.getData());
		double r=Double.parseDouble(s);
		System.out.println("Rate:"+r);
		
		byte rdata2[]=new byte[1024];
		DatagramPacket dp2= new DatagramPacket(rdata2,rdata2.length);
		ss.receive(dp2);
		s= new String(dp2.getData());
		double t=Double.parseDouble(s);
		System.out.println("Time:"+t);
		
		double SI=(p*r*t)/100;
		System.out.println("Simple Intrest Is:"+SI);
		System.out.println("Amount Is:"+(p+SI));
		ss.close();
	}

}
