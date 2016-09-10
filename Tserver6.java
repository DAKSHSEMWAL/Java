import java.io.*;
import java.net.*;
public class Tserver6
{
	public static void main(String[] args)throws Exception
	{
		ServerSocket ss=new ServerSocket(6666);
		Socket con=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
        String r=br.readLine();
        String k="";
        for(int i=r.length()-1;i>=0;i--)
        { 
           char ch=r.charAt(i);
           k=k+ch;
        }
        System.out.print(r);
        if(r.equalsIgnoreCase(k))
            System.out.print(" Is Palindrome");
        else
            System.out.print(" Is Not Palindrome");
        ss.close();

	}

}
