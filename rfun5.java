class rfun5{
    static int i=0;
    public static void fun(int x) {
        if(i==x)
        return;
        for(int j=0;j<x;j++)
        {
            System.out.print("*");
        }
        System.out.println();
        i++;
        fun(x);

    }
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
}