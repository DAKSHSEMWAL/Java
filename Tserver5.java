import java.io.*;
import java.net.*;
public class Tserver5
{
	public static void main(String args[])throws Exception
	{
		ServerSocket ss=new ServerSocket(6666);
		Socket con=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
        String r=br.readLine();
        StringBuffer s1= new StringBuffer(r);
        s1.reverse();
        String k=s1.toString();
        System.out.print(r);
        if(r.equals(k))
        System.out.print(" Is Palindrome");
        else
        System.out.print(" Is Not Palindrome");
        ss.close();

	}

}
