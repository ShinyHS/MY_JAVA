import java.util.Scanner;
class prime{
public static void  main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int s=0;
        int i;
        int n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            if(n%i==0)
            {
                s++;
              
            }
        }
        if(s==2)
        System.out.println(n+"is prime no");
        else
        System.out.println(n+"is not prime no");

    }

}