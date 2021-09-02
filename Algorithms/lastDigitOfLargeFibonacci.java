import java.util.Scanner;
public class lastDigitOfLargeFibonacci {
    static long fibo(int n)
        {
        if(n<=1)
            return n;
        else
        {
        long a[] =new long[n+1];
        a[0]=0;
        a[1]=1;
            for(int i=2;i<=n;i++)
            {
                a[i]=(a[i-1]+a[i-2])%10;
            }
            return a[n];
            }
            
            }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        long val=fibo(n);
        System.out.println(val);
     }}