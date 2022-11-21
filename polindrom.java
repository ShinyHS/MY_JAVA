import java.util.Scanner;
class polindrome{
public static void  main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        int s=0,r,n=x;
        while(x!=0)//127 => 
        {
            r=x%10; //=>r=1 1%10 1
            s=s*10+r;//s=72*10+1; 721
            x=x/10;//12/10 1
        }
        if(s==n)
        System.out.println(n+" it is polindrome");
        else
        System.out.println(n+" it is not polindrome");
    }

}