class rfun1{
    public static void fun(String x,int y) {
        if(y==0)
        return;
        else
        {
        System.out.println(x);
        y--;
        fun(x,y);
        }
    }
    public static void main(String[] args) {
        fun("venkatesh",2);
    }
}