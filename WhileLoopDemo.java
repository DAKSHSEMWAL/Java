import java.io.*;
public class WhileLoopDemo
{
    public static void main(String[] args)throws IOException
    {
    	int no;
    	System.out.println("Demonstration Of While Loop Demo");
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number");
		no=Integer.parseInt(br.readLine());
		int temp=no,sum=0;
        while (temp!=0)
        {
            sum=sum+temp%10;
            temp=temp/10;
        }
        System.out.println("Sum of Digits of "+no+" is "+sum);
    }
}