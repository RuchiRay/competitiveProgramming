import java.util.Scanner;
public class banana
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
int k = kb.nextInt();
int n = kb.nextInt();
int w = kb.nextInt();
int cost = 0;
for(int i=1;i<=w;i++)
{
cost = cost+i*k;
}
int borrow = cost-n;
if(borrow>0)
System.out.println(borrow);
else
System.out.println(0);
}
}