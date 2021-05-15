import java.util.Scanner;
public class nextround
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
System.out.println("enter total number of participants");
int n = kb.nextInt();
System.out.println("enter the position");
int k = kb.nextInt();
System.out.println("enter the scores of the participants");
int a[] = new int[n];
if(n>=k)
{
for(int i=0;i<n;i++)
{
a[i] = kb.nextInt();
}
int count = 0;
int x = a[k-1];
for(int i=0;i<n;i++)
{
if(a[i]>=x&&a[i]>0)
count++;
}
System.out.println("next round peope " + count);
}
}
}