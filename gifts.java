import java.util.Scanner;
public class gifts
{
public static void main()
{
Scanner kb = new Scanner(System.in);
System.out.println("enter test number");
int t = kb.nextInt();
if(t>=1&&t<=1000)
{
for(int j=1;j<=t;j++)
{
System.out.println("enter size of the array");
int n = kb.nextInt();
if(n>=1&&n<=50)
{
long a[] = new long[n];
long b[] = new long[n];
System.out.println("enter "+ n+ " numbers");
for(int i=0;i<n;i++)
{
a[i] = kb.nextLong();
}
System.out.println("enter "+ n+ " numbers");
for(int i=0;i<n;i++)
{
b[i] = kb.nextLong();
}

long sa = a[0];
long sb = b[0];
for(int i=1;i<n;i++)
{
if(a[i]<sa)
sa = a[i];
if(b[i]<sb)
sb = b[i];

}
System.out.println("smallest number is "+sa + sb);
long ma=0,mb=0,mf=0;
for(int i=0;i<n;i++)
{
ma = (a[i]-sa);
mb = (b[i]-sb);
mf = mf+Math.max(ma,mb);
}

System.out.println(mf);
}

}
}
}
}

