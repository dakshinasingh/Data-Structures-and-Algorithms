
package dsarray;
import java.util.*;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int res=0;
        int curr=0;
        while(i<j)
        {
            curr=Math.min(height[i],height[j])*(j-i);
            res=Math.max(curr,res);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return res;
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
        z=maxArea(a);
        System.out.println(z);
    }
}