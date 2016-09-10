class SubClass extends Parentclass
{
	int x;
	int hcf,lcm;
   SubClass(int a,int b)
   {
	super(a);
	x=b;
	hcf=1;
	lcm=1;
   }
   void compute()
   {
       int p=super.x*x;
       for(int i=2;i<p;i++)
       {
           if((super.x%i==0)&&(x%i==0))
           {
               hcf=i;
           }
       }
       lcm=p/hcf;
    }
   void display()
   {
	   System.out.println("Demonstration OF Super Keyword");
	   System.out.println("HCF AND LCM OF "+super.x+" AND "+x);
	   System.out.println("HCF ="+hcf);
	   System.out.println("LCM ="+lcm);
   }
   public static void main(String args[])
   {		
	   SubClass obj= new SubClass(12,16);
	   obj.compute();
       obj.display();	 
   }
}