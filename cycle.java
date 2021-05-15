class ListNode {
      int val;
      ListNode next;
      ListNode check;
     public ListNode(int x) {
          val = x;
          next = null;
          check = null;          
      }
  }
 public class cycle 
 {
    public ListNode detectCycle(ListNode head) 
    {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = new ListNode(4);
        System.out.println(temp.val);
        ListNode tempo = head;
        while(tempo.check!=temp)
        {
            tempo.check = temp;
            tempo = tempo.next;
        }
        System.out.println(tempo.val);
        return tempo;
    }
     public  void main()
    {
    ListNode head = new ListNode(3);
    head.next = new ListNode(2);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(-4);
   
    /* Create a loop for testing */
    head.next.next.next.next = head.next;
    detectCycle(head);
  
    }
}
