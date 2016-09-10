import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Tserver3 
{ 
	public static void main(String[] args)throws IOException
	{
		float t,p,r,si;
		ServerSocket ss=new ServerSocket(6767);
		Socket con=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
		p=Float.parseFloat(br.readLine());
		r=Float.parseFloat(br.readLine());
		t=Float.parseFloat(br.readLine());
		si=(p*t*r)/100.0f;   t=p+si;
		System.out.println("Amount: "+t + "\n Simple Interest:" +si);
		ss.close();
  }
}
