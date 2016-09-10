import java.io.*;
import java.net.*;
public class TServer4 
{
	public static void main(String[] args)throws Exception
	{
		ServerSocket ss=new ServerSocket(6666);
		Socket con=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
        double r=Double.parseDouble(br.readLine());
        double area=3.14*Math.pow(r,2);
        double perimeter=2*3.14*r;
        System.out.println("Area is:"+area);
        System.out.println("Perimeter is:"+perimeter);
        ss.close();

	}

}
