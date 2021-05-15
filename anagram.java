class anagram
{
    static void per(String s  , int l , int r)
    {
        if(l==r)
        {
            System.out.println(s);
            return;
        }
        for(int i=l;i<=r;i++)
        {
            s = interchange(s,l,i);
            per(s,l+1,r);
            s = interchange(s,l,i);
        }
    }
    static String interchange(String s , int a ,int b)
    {
        char ar[] = s.toCharArray();
        char temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
        return String.valueOf(ar);
    }
}