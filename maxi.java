import java.util.*;
 class sliding
{
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int n = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        int ans[] = new int[n-k+1];
        int i=0;
        for(;i<k;i++)
        {
            while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i])
            {
                dq.removeLast();
            }
            dq.addLast(i);
                       
        }
        for(;i<n;i++)
        {
           ans[i-k] = nums[dq.peekFirst()];
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k)
               { 
                dq.removeFirst();
               }
             while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i])
            {
                dq.removeLast();
            }
            dq.addLast(i);
                      
        }
        ans[i-k] = nums[dq.peekFirst()];
           return ans;
    }
    
    
}
public class maxi
{
    public  void main(String[] args)
    {
        sliding sw = new sliding();
        int a[] = {1,2,4,5,6,7,8};
        int an[] = sw.maxSlidingWindow(a,3);
        for(int x:an)
        {
         System.out.println(x);   
        }
    }
}