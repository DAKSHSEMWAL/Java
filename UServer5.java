import java.net.*;
import java.io.*;
public class UServer5
{
  public static void main(String[] args)throws IOException
  {
	DatagramSocket ss=new DatagramSocket(8888);
	byte rdata[]=new byte[1024];
	DatagramPacket dp=new DatagramPacket(rdata,rdata.length);
	ss.receive(dp);
	String s=new String(dp.getData());
	int i,count=0;
	for(i=0;i<s.length();i++)
	{
	 char ch=s.charAt(i);
	 if(ch=='a'||ch=='A'||ch=='i'||ch=='I'||ch=='e'||ch=='E'||
				ch=='o'||ch=='O'||ch=='u'||ch=='U')
	  {
		count=count+1;
		System.out.print(ch +" ");
	  }
	}
	System.out.println("\nTotal no of vowels: "+count);
	ss.close();
 }
}
