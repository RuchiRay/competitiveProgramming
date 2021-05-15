import java.util.*;
public class twins
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
int n = kb.nextInt();
int a[] = new int[n]; int sum=0,sub=0,k=0;
for(int i=0;i<n;i++)
{
a[i] = kb.nextInt();
sum = sum+a[i];
}
Arrays.sort(a);
for(int i=n-1;i>=0;i--)
{
sub = sub+a[i];
sum = sum-a[i];
k++;
if(sub>sum)
break;
}
System.out.println(k);
}
}