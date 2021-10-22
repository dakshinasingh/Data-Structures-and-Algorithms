
package dsarray;

import java.util.Scanner;

public class CellsWithOddValuesInMatrix {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int ch;
    int sum=0;
    int m=in.nextInt();
    int n=in.nextInt();
    int indices[][]=new int[2][2];
    System.out.println("Enter the matrix");
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            indices[i][j]=in.nextInt();
        }
    }
    int[][] matrix=new int[m][n];
     for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=0;
        }
    }

        for (int[] arr : indices) {
        int row = arr[0];
        int col = arr[1];
		
        for (int i = 0; i < n; i++)  // for row increment
            matrix[row][i]++; 
			
        for (int i = 0; i < m; i++) // for column increment
            matrix[i][col]++;
    }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
        }
            System.out.println("");
    }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]%2!=0)
                    sum++;
        }
    }
        System.out.println("output= "+sum);
    }
    
}

/*
run:
2
3
Enter the matrix
0
1
1
1
1 3 1 
1 3 1 
output= 6
*/