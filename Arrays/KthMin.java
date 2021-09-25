package dsaarray;

import java.util.*;

public class KthMin {

    static void kthmin(int a[], int x) {
        Arrays.sort(a);
        System.out.println("The kth min element of array is: " + a[x - 1]);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int x = in.nextInt();
        kthmin(a, x);
    }
}
