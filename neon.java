import java.util.Scanner;
class neon{
public static void  main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n,s=0,x,r;
        n=sc.nextInt();//9
        x=n*n;//81
        while(x!=0)//8
        {
            r=x%10;//8%10=>8
            s=s+r;//s=1+8;=>9
            x=x/10;//81/10=>8/10=.
        }
        if(n==s)
        {
            System.out.println(n+"is neon number");
        }
        else
        {
            System.out.println(n+"is not neon number");
        }
    }

}