class rfun8{
    static int i=0;
    public static void fun(int x,int y) {
        if(i==y)
        return;
        for(int j=0;j<x;j++)
        {
            if(i%2==0)
            System.out.print(j+" ");
            else
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
        i++;
        fun(x,y);
    }
    public static void main(String[] args) {
        int n=5;
        fun(n,n);
    }
}