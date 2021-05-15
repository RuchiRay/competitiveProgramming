import java.util.*;
class majority
 {
    public int majorityElement(int[] nums)
    {
     int x = nums.length; int k=0; int major = 0; int y = x/2;
     Arrays.sort(nums);
        if(x==1)
            return nums[0];
        else
        {
     for(int i=0;i<x-1;i++)
     {
         if(nums[i]==nums[i+1])
         k = k+1;
         else
             k = 0;
         if(k+1>y)
         {
             major = nums[i];
             break;
         }
         }
        return major;
        }
}
}