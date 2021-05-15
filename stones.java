import java.util.Scanner;
public class stones
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
int n = kb.nextInt();
String s = kb.next(); int k=0;
for(int i=0;i<n-1;i++)
{
if(s.charAt(i)==s.charAt(i+1))
k++;
}
System.out.println(k);
}
}