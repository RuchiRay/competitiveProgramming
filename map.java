import java.util.*;
import java.util.Map.Entry;
public class map
{
    public static void main()
    {
        Map<String , Integer> num = new HashMap<>();
        num.put("one",1);
        num.put("two",2);
        num.put("three",3);
        num.put("one",10);
        num.putIfAbsent("four",4);
        num.putIfAbsent("one",4);
        System.out.println(num.get("two"));
        System.out.println(num);
        Set<Entry<String,Integer>> entries = num.entrySet();
        for(Entry<String,Integer> entry:entries)
        {
            entry.setValue(entry.getValue()*100);
        }
        System.out.println(num);
    }
}