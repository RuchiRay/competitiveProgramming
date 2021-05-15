import java.util.*;
public class deq
{
public static void main()
{
// stack cannot be implemented using arraydeque and arraylist
// stack is a class
// queue is interface
 ArrayDeque<Integer> ad = new ArrayDeque<>();
 
ad.push(43);
ad.push(23);
ad.push(16);
int x = ad.pop();
System.out.println(ad.peek());
}
}
