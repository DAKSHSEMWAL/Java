import java.io.*;
import java.net.*;
public class Server1
{

	public static void main(String[] args)throws Exception
	{
		int s;
		ServerSocket ss=new ServerSocket(5000);
		Socket con=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
		s=Integer.parseInt(br.readLine());
		System.out.println("Square of "+s+" is "+(s*s));
		ss.close();
	}

}

