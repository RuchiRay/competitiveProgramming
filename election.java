import java.util.*;
public class election
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
System.out.println("enter t");
int t = kb.nextInt();
int swap[] = new int[t];
for(int i=0;i<t;i++)
{
System.out.println("enter n");
int n = kb.nextInt();
System.out.println("enter m");
int m = kb.nextInt();
List<Integer> a = new ArrayList<>();
List<Integer> b = new ArrayList<>();
System.out.println("enter array n");
for(int j=0;j<n;j++)
a.add(kb.nextInt());
System.out.println("enter array nm");
for(int k=0;k<m;k++)
b.add(kb.nextInt());
Collections.sort(a);
Collections.sort(b);
Collections.reverse(b);
if(sum(a,n)>sum(b,m))
swap[i] = 0;
else
{
int w = 0,temp=0; boolean flag = false;int x = Math.min(n,m);
for(int q=0;q<x;q++ )
{
temp = a.get(q);
a.set(q,b.get(q));
b.set(q,temp);
w++;
if(sum(a,n)>sum(b,m))
{
flag = true;
break;
}
}
if(flag==true)
swap[i]  = w;
else
swap[i] = -1;
}
}
for(int yz = 0;yz<t;yz++)
System.out.println(swap[yz]);
}
static int sum(List<Integer> c , int p)
{
int sum = 0;
for(int i=0;i<p;i++)
{
sum = sum+c.get(i);
}
return sum;
}
}


