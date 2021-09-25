package dsarray;

import java.util.Scanner;

public class MinAndMax {

    static void minmax(int a[]) {
        int max = a[0];
        int min = a[0];
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("The max element of array is: " + max);
        System.out.println("The min element of array is: " + min);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        minmax(a);
    }
}
