import java.util.Scanner;
public class team
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
int n = kb.nextInt();
int mat[][] = new int[n][3];
for(int i=0;i<n;i++)
{
for(int j=0;j<3;j++)
{
mat[i][j] = kb.nextInt();
}
}
int k = 0,count=0;
for(int i = 0;i<n;i++)
{
k=0;
for(int j=0;j<3;j++)
{
if(mat[i][j]==1)
k++;
}
if(k>=2)
count++;
}
System.out.println( count);
}
}