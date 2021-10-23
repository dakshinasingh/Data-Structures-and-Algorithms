package dsarray;

import java.util.Scanner;

public class rotate {
    
    public static int[][] findRotation(int[][] mat) {
        
        int n=mat.length;
        int[][] matrix=new int[n][n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=mat[n-j-1][i];
                }
            }return matrix;
    }
        public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of matrix");
        n=in.nextInt();
        int matrix[][]=new int[n][n];
        int mat[][]=new int[n][n];
        System.out.println("Enter the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=in.nextInt();
                }
            }
        mat=findRotation(matrix);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
                }
            System.out.println(" ");
            }
        
        
    }
    }
    
    
//    public int[][] rotate(int[][] arr){
//             int[][] ans=new int[arr.length][arr.length];
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                ans[i][j]=arr[j][i];
//            }
//        }
//            for(int i=0;i<ans.length;i++){
//            for(int j=0;j<ans.length/2;j++){
//                int temp=ans[i][j];
//                ans[i][j]=ans[i][ans.length-1-j];
//                ans[i][ans.length-1-j]=temp;
//            }
//        }
//    }

