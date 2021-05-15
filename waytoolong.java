import java.util.Scanner;
public class waytoolong
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
System.out.println("enter a number");
int n = kb.nextInt();
String word[] = new String[n];
System.out.println("enter "+ n + " words");
kb.nextLine();
for(int i=0;i<n;i++)
{
 word[i] = kb.nextLine();
}
if(n>=1&&n<=100)
{
for(int i=0;i<n;i++)
{
int l = word[i].length();
if(l<=10)
System.out.println(word[i]);
else
{
String s = String.valueOf(l-2);
word[i] = word[i].charAt(0)+s+word[i].charAt(l-1);
System.out.println(word[i]);
}
}
}
}
}