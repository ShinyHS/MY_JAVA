class fibonaci{
    public static void main(String[] args) {
        int a=1;//a b s
        int b=1;//1 1 2
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<10;i++)
        {
             int s=a+b;
             System.out.println(s);
             a=b;
             b=s;
        }
    }
}