import java.util.Scanner;
class prime{
public static void  main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n,s=0;
        n=sc.nextInt();//
        for(int i=1;i<=n;i++) // 1 2 3 4 5 6 6
        {
            if(n%i==0)//5%i
            {
                s++; //s=4; 
            }
        }
        if(s<=2)//s==4
        System.out.println(n+"is prime no");
        else
        System.out.println(n+"is not prime no");

    }

}