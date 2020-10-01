import java.util.*;
class PositiveInteger
{
    public static void main(String args[])
    {
        Scanner inpt = new Scanner(System.in);
        int N = inpt.nextInt();
        int sum = 1;
        for(int i = 1;i<=N;i++)
        {
           if(i==1 || i==N)
               continue;
            else{
            int c =0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    c++;
                
            }
                if(c==2)
                if(N%i==0)
                {
                    sum*=i;
                }
            }
            }
        
            if(N==sum)
            {
                System.out.print("True");
            }
            else
            {
                System.out.print("False");
            }
        }

}