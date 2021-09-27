package dsabasic;

import java.util.Scanner;

public class ReverseAnInteger {

    public static int reverse(int x) {

        long res = 0;

        while (x != 0) {
            int rem = x % 10;
            x = x/ 10;
            res = res * 10 + rem;
        }
            if ((res >Integer.MAX_VALUE) || (res <Integer.MIN_VALUE)) {
                return 0;
            }
                else
                return (int)res;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Reverse= " + (reverse(n)));
    }

}
