import java.util.*;
class outerpara
 {
      public String removeOuterParentheses(String S)
    {
      Stack<Character> st = new Stack<>();
        String s = "", ans = "";
      for(int i=0;i<S.length();i++)
      {
        char ch = S.charAt(i);
        s = s+String.valueOf(ch);
        if(ch=='(')
        {
          st.push(ch);
          continue;
        }
        if(ch==')')
        {
          if(st.peek()=='(')
            st.pop();
        }
        if(st.isEmpty())
        {
          ans = ans+remove(s);
          s = "";
        }
      }
        return ans;
}
  String remove(String rem)
  {
    rem = rem.substring(1,rem.length()-1);
    return rem;
  }
}