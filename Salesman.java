import java.io.*;
public class Salesman
{
	public static void main(String args[])throws IOException
		{
			int sale[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
			int sum1=0,sum2=0;
			System.out.println("_________________________________________________________");
			System.out.println("|         \t|Quart1\t|Quart2\t|Quart3\t|Quart4\t|Total\t|");
			for(int i=0;i<4;i++)
			{
				sum1=0;
				System.out.println("---------------------------------------------------------");
				if(i==0)
					System.out.print("|Salesman 1");
				else
				if(i==1)
					System.out.print("|Salesman 2");
				else
				if(i==2)
					System.out.print("|Salesman 3");
				else
					System.out.print("|Saleaman 4");
				for(int j=0;j<4;j++)
				{
					sum1+=sale[i][j];
					System.out.print("\t|  "+sale[i][j]);
				}
				System.out.print("\t|  "+sum1+"\t|");
				System.out.println();
			}
			System.out.println("---------------------------------------------------------");
			System.out.print("|Total     ");
			for(int i=0;i<4;i++)
			{
				sum2=0;
				for(int j=0;j<4;j++)
				{
					sum2+=sale[j][i];
				}
				System.out.print("\t|  "+sum2);
			}
			System.out.print("\t|  \t|");
			System.out.println();
			System.out.println("_________________________________________________________");
	}

}
