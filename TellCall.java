
public class TellCall
{

	double bill;
	int calls;
	int phno;
	String sname;
	TellCall(int n,int n1,String s)
	{
		phno=n1;
		calls=n;
		sname=s;
	}
	void compute()
	{
	if(calls<=100)
		bill=500;
	else if (calls>=101 && calls<=200)
  	{
     	calls=calls-100;
     	bill=200+(1.00*(calls-100));
	}
	else if (calls>=201 && calls<=300)
	{
		
		bill=200+(1.00*100)+(1.20*(calls-200));
 	}
	else
	{
		bill=200+(1.00*100)+(1.20*200)+(1.50*(calls-300));
	}
	}
	void display()
	{
		System.out.println("\tBharat Sanchar Nagam Limited\t\t\n\n");
		System.out.println("Coustomer Name:"+sname+"\tCoustomer Phone Number:"+phno);
		System.out.println("No Of Calls\t\t\tRates");
		System.out.println("-------------------------------------------------------------");
		System.out.println("1-100\t\t\t  Rs. 500/- rental charge only");
		System.out.println("101-200\t\t\tRs. 1.00 per call+rental charge");
		System.out.println("201-300\t\t\tRs. 1.20 per call+rental charge");
		System.out.println("Above 300\t\tRs. 1.50 per call+rental charge only");
		System.out.println("-------------------------------------------------------------");
		System.out.println("No Of Calls "+calls);
		System.out.println("Amount to be paid "+bill);
	}

	public static void main(String args[])
	{
		TellCall ob=new TellCall(466,87946622,"Joey");
		ob.compute();
		ob.display();
	}
	 


}
