class logs {
    public int minOperations(String[] logs) 
    {
      int k=0;
     for(int i=0;i<logs.length-1;i++)   
     {
       if(logs[i].equals("../"))
       {
           k--;
           
           continue;
        } 
       else if(logs[i].equals("./"))
         continue;
     else  if(logs[i]!=logs[i+1])
         k++;
       }
      if(k<0)
      return 0;
      else
        return k;
    }
}