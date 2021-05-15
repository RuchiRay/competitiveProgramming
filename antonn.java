import java.util.Scanner;
public class antonn
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
int n = kb.nextInt();
String s = kb.next();
int anton=0,danik=0;
for(int i=0;i<n;i++)
{
if(s.charAt(i)=='A')
anton++;
else
danik++;
}
if(anton>danik)
System.out.println("Anton");
else if(anton==danik)
System.out.println("Friendship");
else
System.out.println("Danik");

}
}