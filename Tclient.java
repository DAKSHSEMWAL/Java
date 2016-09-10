import java.io.*;
import java.net.*;
public class Tclient
{
	public static void main(String args [])throws IOException
	{
		String s;
		Socket cs=new Socket("localhost",4444);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream o=new DataOutputStream(cs.getOutputStream());
		System.out.println("Enter A Message From Client Window");
		s=br.readLine();
		o.writeBytes(s+"\n");
		cs.close();
	}

}
