import java.io.*;
public class Abbrevation 
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int q=Integer.parseInt(br.readLine());
		String a=br.readLine();
		String b=br.readLine();
		String temp="";
		int f=0;
		while(f!=q)
		{
			for(int i=0;i<b.length();i++)
			{
				int e=0;
				while(e<a.length())
				{
					if((""+a.charAt(e)).equalsIgnoreCase((""+b.charAt(i))))
					{
						temp+=a.charAt(e);
					}
					else
					{
						;
					}
					e++;
				}
			}
			f++;
		}
		a=temp.toUpperCase();
		if(a.equals(b))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
