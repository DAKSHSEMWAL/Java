import java.io.*;
import java.net.*;
public class DakshClient 
{  public static void main(String[] args)throws IOException
   {
	String s;
	Socket cs=new Socket("192.168.144.1",6666);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream o=new DataOutputStream(cs.getOutputStream());
	System.out.println("Enter a message in client window: ");
	s=br.readLine();
	o.writeBytes(s+"\n");
    cs.close();
	}
}
