package dsarray;

import java.util.Scanner;

public class ProductExceptSelf {
    
    public static int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int prod=1;
        int flag=0;
        int c=0;
        for(int i=0;i<answer.length;i++){
            if(nums[i]!=0)
            {
                prod=prod*nums[i];
            }
            else{
                flag=1;
                c++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(flag==1){
                if(c>1)
                    answer[i]=0;
                else if(nums[i]!=0)
                    answer[i]=0;
                else
                    answer[i]=prod;
            }
            else{
                answer[i]=prod/nums[i];
            }
        }
        return answer;
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n=in.nextInt();
        int arr[]=new int[n];
        int array[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        array=productExceptSelf(arr);
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" , ");
        }
        
    }
}
