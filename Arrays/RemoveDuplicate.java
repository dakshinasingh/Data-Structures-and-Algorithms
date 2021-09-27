
package dsarray;

import java.util.Scanner;

public class RemoveDuplicate {
    public static int removeElement(int[] nums, int val) {
        int pos=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[pos]=nums[i];
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
        int val=in.nextInt();
        z=removeElement(a,val);
        System.out.println(z);
    }
}
    
