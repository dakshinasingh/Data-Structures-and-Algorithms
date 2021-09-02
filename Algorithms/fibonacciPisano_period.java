import java.util.Scanner;
public class fibonacciPisano_period {
    static long pisano(long m)
    {
        long a=0,b=1,c=0;
        long res=0;
        for(int i=0;i<m*m;i++)
        {
            c=(a+b)%m;
            a=b;
            b=c;
            if(a==0 && b==1)
                res=i+1;
        }
        return res;
    }
    static long fibo(long n,long m)
        {
            long rem=n%pisano(m);
            long a=0,b=1,res=rem;
        
            for(int i=1;i<rem;i++)
            {
                res=(a+b)%m;
                a=b;
                b=res;
            }
            return res%m;
        }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        long m=in.nextLong();
        long val=fibo(n,m);
        System.out.println(val);
     }}

