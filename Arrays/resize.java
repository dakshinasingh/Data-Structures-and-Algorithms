package dsarray;

import java.util.Scanner;

public class resize {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if(mat.length*mat[0].length!=r*c)
            return mat;
        int arr[][]=new int[r][c];
        int row=0;
        int col=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++){
                arr[row][col]=mat[i][j];
                col++;
                if(col==c){
                    row++;
                    col=0;
                }
                    
            }
        }
        if((row==r)&&(col==0))
            return arr;
        else
            return mat;
    }

public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the rows of array");
        int n=in.nextInt();
        System.out.println("Enter the columns of array");
        int m=in.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Enter the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=in.nextInt();
                }
            }
        
        
        System.out.println("Enter the number of rows of resized array");
        int c=in.nextInt();
        System.out.println("Enter the number of columns of resized array");
        int r=in.nextInt();
      
        System.out.println("Maximum sum= "+matrixReshape(matrix,r,c));
    }    
    
}
