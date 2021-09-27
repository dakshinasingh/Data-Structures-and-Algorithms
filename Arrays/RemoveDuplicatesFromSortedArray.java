
package dsarray;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int pos=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]>nums[i])
            {
                nums[pos]=nums[i+1];
                pos++;
            }
        }
        return pos;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int z;
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        z=removeDuplicates(a);
        System.out.println(z);
    }
}
