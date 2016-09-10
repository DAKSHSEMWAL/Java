import java.io.*;
import java.net.*;
public class Tserver
{

	public static void main(String[] args)throws Exception
	{
		String s;
		ServerSocket ss=new ServerSocket(4444);
		Socket con=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
		s=br.readLine();
		System.out.println("Message From Client is :"+s);
		ss.close();
	}

}
