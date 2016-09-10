import java.io.*;
import java.net.*;
public class DakshServer
{  public static void main(String[] args)throws IOException
    {
String s;
	ServerSocket ss=new ServerSocket(6666);
	Socket con=ss.accept();
	BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
	s=br.readLine();
	System.out.println("Message from client is: "+s);
	ss.close();
	}
}
