package dsarray;

import java.util.Scanner;

public class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        int pri_sum=0;
        int sec_sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
                pri_sum=pri_sum+mat[i][i];
    }
        int k=n-1;
        for(int i=0;i<n;i++){
            sec_sum=sec_sum+mat[i][k];
            k=k-1;
        }
        sum=pri_sum+sec_sum;
        if(n%2!=0){
            sum=sum-mat[n/2][n/2];
        }
        return sum;
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of matrix");
        n=in.nextInt();
        int matrix[][]=new int[n][n];
        System.out.println("Sum = "+ diagonalSum(matrix));
    }
}
