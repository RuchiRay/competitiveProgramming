public class recurfill
{
    public static void main()
    {
        int a[][] = {{1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,0,0},
        {1,0,0,1,1,0,1,1},
        {1,2,2,2,2,0,1,0},{1,1,1,2,2,0,1,0},{1,1,1,2,2,2,2,0},{1,1,1,1,1,2,1,1},{1,1,1,1,1,2,2,1}};
        printMatrix(a);
        floodfill(a,4,4,7,2,"check");
        System.out.println();
        printMatrix(a);
        
    }
    static void floodfill(int a[][] , int r , int c , int newfill , int prevfill,String fun)
    {
        int row = a.length;
        int col = a[0].length;
        if(r<0||c<0||r>=row||c>=col)
        {
            System.out.println("returning from "+ fun);
            return;
        }
        
        if(a[r][c]!=prevfill)
         {
            System.out.println("returning from " + fun);
            return;
        }
        a[r][c] = newfill;
        
        floodfill(a,r-1,c,newfill,prevfill,"first");
        floodfill(a,r,c-1,newfill,prevfill,"second");
        floodfill(a,r+1,c,newfill,prevfill,"third");
        floodfill(a,r,c+1,newfill,prevfill,"fourth");
    
    }
    static void printMatrix(int a[][])
    {
        int m = a.length;
        int n = a[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}