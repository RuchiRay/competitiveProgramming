/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;
public class intersectionlinked {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA==null||headB==null)
           return null;
        ListNode tempA = headA;
        ListNode tempB = headB;
        List <ListNode> vis = new LinkedList<>();
        
         while(tempA!=null)
         {
             vis.add(tempA);
             tempA = tempA.next;
         }
        while(tempB!=null)
         {
             if(vis.contains(tempB))
                 return tempB;;
            tempB = tempB.next;
         }
        return null;
    }
}