import java.io.*;
public class Solution 
{
    public static void main(String[] args) throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       int k=Integer.parseInt(br.readLine());
       int c[]=new int[n];
       for(int i=0;i<n;i++)
       {
    	  c[i]=Integer.parseInt(br.readLine()); 
       }
       int bcharged=Integer.parseInt(br.readLine());
       int bactual=0;
       for(int i=0;i<n;i++)
       {
    	   if(c[i]==c[k])
    	   {
    		   ;
     	   }
    	   else
    	   {
    		   bactual+=c[i];
    	   }
       }
       bactual=bactual/2;
       int bdifference=bcharged-bactual;
       if(bdifference==0)
       {
    	   System.out.println("Bon Appetit");
       }
       else
       {
    	   System.out.println(bdifference);
       }
    }
}