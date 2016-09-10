import java.io.*;
public class SwitchDemo 
{
		public static void main(String args[])throws IOException
		{
			int mno,dno,yr;
			System.out.println("Demonstration of Switch Loop\n\n");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Month");
			mno=Integer.parseInt(br.readLine());
			System.out.println("Enter Date");
			dno=Integer.parseInt(br.readLine());
			System.out.println("Enter Year");
			yr=Integer.parseInt(br.readLine());
			System.out.println("Date is:-");
			System.out.print(dno+"/");
			switch(mno)
				{
					case 1:System.out.print("Januarary/");
							break;
					case 2:System.out.print("Feburary/");
					 		 break;
					case 3:System.out.print("March/");
							break;
					case 4:System.out.print("April/");
							break;
					case 5:System.out.print("May/");
							break;
					case 6:System.out.print("June/");
							break;
					case 7:System.out.print("July/");
							break;
					case 8:System.out.print("August/");
							break;
					case 9:System.out.print("September/");
							break;
					case 10:System.out.print("October/");
							break;
					case 11:System.out.print("November/");
							break;
					case 12:System.out.print("December/");
							break;
					default :
							 break;
				}
			System.out.println(yr);
			
	}
}
