
public class WithLabelledLoop
    {
        public static void main(String args[])
        {
            int i,j;
            System.out.println("Demonstration Of Labelled Loop");
            loop1:   for(i=1;i<=10;i++)
            {
                System.out.println();

                   for(j=1;j<=10;j++)
                {
                    System.out.print(j + " ");

                    if(j==5)
                        break loop1;     //Statement 1
                }                
            }
        }
    }
