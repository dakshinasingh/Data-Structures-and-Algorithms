package dsarray;

import java.util.Scanner;

public class ReverseAnArray {

    static void reverse(int a[]) {
        int n = a.length;
        System.out.println("The reverse array is: ");
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        reverse(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
}
