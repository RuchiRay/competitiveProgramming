import java.util.Scanner;
public class bear
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
int a = kb.nextInt();
int b = kb.nextInt();
int t=0;
while(a<=b)
{
a = a*3;
b = b*2;
t++;
}
System.out.println(t);
}
}