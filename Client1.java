import java.io.*;
import java.net.*;
public class Client1
{
	public static void main(String args [])throws IOException
	{
		String s;
		Socket cs=new Socket("localhost",5000);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream o=new DataOutputStream(cs.getOutputStream());
		System.out.println("Enter A Number From Client Window");
		s=br.readLine();
		o.writeBytes(s);
		cs.close();
	}

}
