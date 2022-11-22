class strong{
    public static int fun(int x) {
        int sum=1;
        for(int i=1;i<=x;i++)
        sum=sum*i;//1 6 24
        return sum;
    }
     public static void check(int s,int sum) {
        if(s==sum)
        System.out.println(s+" :is strong number");
        else
        System.out.println(s+" :is not strong number");
    }
    public static void main(String[] args) {
        int s=145;
        int s1=s;
        int sum=0;
        while(s!=0)
        {
            int x=s%10;
            sum+=fun(x);
            s=s/10;
        }
       check(s1,sum);
    }
}