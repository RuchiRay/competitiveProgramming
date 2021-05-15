class taxicab
{
public static void main() {
    int n=1, i, count=0, j, k, int_count;
    //("Enter the number of values needed: ");
    //scanf("%d", &n);
    i=1;
    while(count < n) {
       int_count = 0;
       System.out.println("initial value of i"+i);
       for (j=1; j<=Math.pow(i, 1.0/3); j++) 
       {
          for(k=j+1; k<=Math.pow(i,1.0/3); k++) 
          {
              if(j*j*j+k*k*k == i)
              int_count++;
              
          }
          
       }
       if(int_count == 2) {
          count++;
          System.out.println("Got  Hardy-Ramanujan numbers "+  i);  
       }
       i++;
    }
}
}