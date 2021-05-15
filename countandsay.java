class countandsay 
{
    public String countAndSay(int n)
    {
        String x = "1"; char num;String y="";
      for(int i=2;i<=n;i++)
      {
         for(int j=0;j<x.length();)
         {
             num = x.charAt(j);
             int fr = check(j,x);
             String freq = String.valueOf(fr);
             y = y+freq+num;
             j = j+fr;
         }
         x = y;
         y = "";
      }
      return x;
    }
    public int check(int k,String z)
    {
        int f = 1;
        for(int i=k;i<z.length()-1;i++)
        {
            if(z.charAt(i)==z.charAt(i+1))
            f++;
            else
            break;
        }
        return f;
    }
}