package dsarray;

import static dsarray.DiagonalSum.diagonalSum;
import java.util.Scanner;

public class transpose {
    public static int[][] transpose(int[][] matrix) {
        int[][] mat=new int[matrix[0].length][matrix.length];
            for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                mat[j][i]=matrix[i][j];
        }
    }
        return mat;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of matrix");
        n=in.nextInt();
        int matrix[][]=new int[n][n];
        System.out.println(transpose(matrix));
    }
}
