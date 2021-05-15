class addbin
{
public String addBinary(String a, String b)
    {
        String u,v;
        if(a.length()<b.length())
        {
            u = b;
            v = a;
        }
        else
        {
            u = a;
            v = b;
        }
        int x = u.length();
        int y = v.length();
        
        String c = ""; char cha,chb;int m,n,q=0;
        for(int i=x-1,j=y-1;i>=0;i--,j--)
        {
            if(j>=0)
            {
                cha = u.charAt(i);
                chb = v.charAt(j);
                m = Integer.parseInt(String.valueOf(cha));
                n = Integer.parseInt(String.valueOf(chb));
                if(m+n+q==2&&i!=0)
                {
                    c = c+"0";
                    q=1;
                 
                    continue;
                }
                if(m+n+q==3&&i!=0)
                {
                    c = c+"1";
                    q=1;
                                     continue;
                }
                if(m+n+q==1&&i!=0)
                {
                    c = c+"1";
                    q=0;
                                     continue;
                }
                if(m+n+q==0&&i!=0)
                {
                    c = c+"0";
                    q=0;
                                     continue;
                }
                if(i==0)
                {
                    if(m+n+q==3)
                    {
                        c = c+"11";
                       }
                     if(m+n+q==2)
                     {
                    c = c+"01";
               
                }
                    if(m+n+q==1)
                    {
                    c = c+"1";
                    
                }
                if(m+n+q==0)
                c = c+"0";
            }
            }
            else
            {
                cha = u.charAt(i);
                m = Integer.parseInt(String.valueOf(cha));
               if(m+q==2&&i!=0)
               {
                   c = c+"0";
                   q=1;
                   continue;
                }
                if(m+q==1&&i!=0)
                {
                    c = c+"1";
                    q=0;
                    continue;
                }
                if(m+q==0&&i!=0)
                {
                    c = c+"0";
                    q=0;
                    continue;
                }
                if(i==0)
                {
                    if(m+q==2)
                    c = c+"01";
                    else
                    c = c+"1";
                }
            }
        }
        StringBuffer ans = new StringBuffer(c);
        ans = ans.reverse();
        String r = String.valueOf(ans);
        return r;
       }
}