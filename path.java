public class path
{
    public static void main()
    {
     System.out.println(paths(4,4));   
    }
    static int paths(int m , int n)
    {
        if(m==1||n==1)
        return 1;
        else
        return paths(m,n-1)+paths(m-1,n);
    }
}