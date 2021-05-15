import java.util.Scanner;
public class domino
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
System.out.println("enter the size");
double m = kb.nextDouble();
double n = kb.nextDouble();
double x = (m*n)/2;
double y = Math.floor(x);
System.out.println((long)y);
}
}