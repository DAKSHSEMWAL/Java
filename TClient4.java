import java.io.*;
import java.net.*;
public class TClient4 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Radius");
		String s=br.readLine();
		Socket cs=new Socket("localhost",6666);
		DataOutputStream o=new DataOutputStream(cs.getOutputStream());
		o.writeBytes(s+"\n");
		cs.close();

	}

}
