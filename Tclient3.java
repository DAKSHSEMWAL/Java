import java.io.*;
import java.net.*;
public class Tclient3 
{ 
	public static void main(String[] args)throws IOException
    {  
	  String s,r,t;
      Socket cs=new Socket("localhost",6767);
      BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
      DataOutputStream o=new DataOutputStream(cs.getOutputStream());
      System.out.println("Enter the principal amount, rate and time:");
      s=br.readLine();
      r=br.readLine();
      t=br.readLine();
      o.writeBytes(s+"\n"+r+"\n"+t+"\n");
      cs.close();
    }
}
