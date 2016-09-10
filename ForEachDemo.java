import java.io.*;
public class ForEachDemo {
public static void main(String args[])throws IOException
{  
	int k[][]=new int[3][3];
	int sum=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Value of Matrix");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			k[i][j]=Integer.parseInt(br.readLine());
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
				System.out.print(k[i][j]+" ");
		}
		System.out.println();
	}
	for(int i[]:k)
	{ 
		for(int j:i)
		{	
			sum=sum+j;
		}
	}
	System.out.println("Sum Of all element is="+sum);
}
}
