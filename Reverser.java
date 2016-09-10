import java.io.*;
public class Reverser
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("");
		int n=Integer.parseInt(br.readLine());
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=br.readLine();
		}
		for(int i=0;i<n;i++)
		{ 
			String[] k=s[i].split(" ");
			StringBuilder sb=new StringBuilder();
			for(int j=k.length-1;j>-1;j--)
			{
				sb.append(k[j]+" ");
			}
			s[i]=sb.toString();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Case #"+(i+1)+": "+s[i]);
		}
	}
}
