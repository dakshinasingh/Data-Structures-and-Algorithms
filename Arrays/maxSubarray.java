package dsarray;

import java.util.Scanner;

public class maxSubarray {
    
    public static int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=max;
        for(int i=1;i<nums.length;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            max=Math.max(sum,max);
        }
        return max;
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Maximum sum= "+maxSubArray(arr));
    }
}
