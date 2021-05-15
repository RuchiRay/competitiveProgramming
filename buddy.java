import java.util.*;
class buddy
{
    public boolean buddyStrings(String A, String B)
    {
     Map<Character,Integer> a = new HashMap<>();
     int na = A.length();
        int nb = B.length();
        if(na!=nb)
            return false;
        for(int i = 0;i<na;i++)
        {
            char ch = A.charAt(i);
            if(a.containsKey(ch))
            {
                a.put(ch,a.get(ch)+1);
            }
            else
            {
                a.put(ch,1);
            }
        }
        
        System.out.println(a);
        return true;
    }
}