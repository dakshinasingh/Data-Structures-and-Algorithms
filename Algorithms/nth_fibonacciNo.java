import java.util.Scanner;
public class nth_fibonacciNo {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        long a=0;
        long b=1;
        long c=0;
        if(n<=1)
            System.out.println(n);
        else
        {
        for(int i=1;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
     }}
}
