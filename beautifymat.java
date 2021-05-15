import java.util.Scanner;
public class beautifymat
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
int a[][] = new int[5][5];int m=0,n=0,moves=0;
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
a[i][j] = kb.nextInt();
if(a[i][j]==1)
{ m = i;
  n=j;
}
}
}
if(n<2)
{
moves = 2-n;
if(m<2)
moves = moves + 2-m;
else
moves = moves + m-2;
}
else
{
moves = n-2;
if(m<2)
moves = moves + 2-m;
else
moves = moves + m-2;
}
System.out.println(moves);
}
}
