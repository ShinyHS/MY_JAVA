class rfun7{
    static int i=0;
    public static void fun(int x,int y) {
        if(i==y+1)
        return;
        for(int j=0;j<i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
        i++;
        fun(x-1,y);

    }
    public static void main(String[] args) {
        int n=5;
        fun(n,n);
    }
}