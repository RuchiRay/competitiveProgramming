class maxcoingame
{
    public static void main()
    {
        int a[] = {1,5,7,3,2,4};
        System.out.println(coinmax(a,0,5));
    }
    static int coinmax(int a[] , int l , int r)
    {
        if(l+1==r)
        {
            System.out.println(Math.max(a[l],a[r]));
            return Math.max(a[l],a[r]);
            
        }
        return Math.max(a[l]+Math.min(coinmax(a , l+2,r),coinmax(a,l+1,r-1)),a[r]+Math.min(coinmax(a , l+1,r-1),coinmax(a,l,r-2)));
    }
}