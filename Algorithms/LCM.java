
import java.util.Scanner;
public class LCM {
    static long gcd(int a,int b)
    {
        int rem=0;
        while(b!=0)
        {
            rem=a%b;
            a=b;
            b=rem; 
            
        }
        return a;
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        long gcd=gcd(a,b);
        System.out.println((a/gcd)*b);
     }
}
