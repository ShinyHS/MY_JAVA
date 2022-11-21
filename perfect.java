class perfect{
    static int i=1,sum=0;
    public static void fun(int x) {
        if(i==x)
        {
            check(sum,x);
            return;
        }
        int a=x%i;
        if(a==0)
        {
            sum=sum+i;
        }
        i++;
        fun(x);
    }
    public static void check(int sum,int x) {
        if(sum==x)
        System.out.println(x+" perfect number");
        else
        System.out.println(x+" not perfect number");
    }
    public static void main(String[] args) {
        //6% 1 2 3 =>6
        int x=56;
        //fun(x);
        fun(28);
        // fun(100);
    }
}