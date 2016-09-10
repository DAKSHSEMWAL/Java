import java.io.*;

public class Survey
{
	public static void main(String args[])throws IOException
	{
		int choice,sur[][]=new int [4][4];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				sur[i][j]=0;
			}
		}
		char cityCode;
		int carCode;
		do
		{
			System.out.println("******Main Menu*****");
			System.out.println("Press[D] for Delhi");
			System.out.println("Press[M] for Mumbai");
			System.out.println("Press[K] for Kolkata");
			System.out.println("Press[C] for Chennai");
			System.out.println("Enter The City Code");
			String temp=br.readLine();
			cityCode=temp.charAt(0);
			System.out.println("Press[0] for K-10");
			System.out.println("Press[1] for Zen-Astelo");
			System.out.println("Press[2] for Wagonar");
			System.out.println("Press[3] for Sx-4");
			System.out.println("Enter The Car code");
			carCode=Integer.parseInt(br.readLine());
			switch(cityCode)
			{
				case 'D':sur[0][carCode]++;
						 break;
				case 'M':sur[1][carCode]++;
				 		 break;
				case 'K':sur[0][carCode]++;
						 break;
				case 'C':sur[0][carCode]++;
				 		 break;
				default :System.out.println("!!Invalid Choice");
						 break;
			}
			System.out.println("Do You Want To Continue???\nPress 1 for YES\nPress 2 for NO");
			choice=Integer.parseInt(br.readLine());
		}while(choice==1);
		System.out.println("\t  K-10  Zen-Astelo  Wagonar  Sx-4");
		for(int i=0;i<4;i++)
		{
			if(i==0)
				System.out.print("Delhi  ");
			else
			if(i==1)
				System.out.print("Mumbai ");
			else
			if(i==2)
				System.out.print("Kolkata");
			else
				System.out.print("Chennai");
			for(int j=0;j<4;j++)
			{
				System.out.print("     "+sur[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
