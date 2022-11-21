import java.util.Scanner;
class ams{
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);//371 
        int x=sc.nextInt();
        int r,s=0,n=0,k=x;
        while(x!=0)
        {
            r=x%10; 
            s=s+r*r*r;
            x=x/10;
        }
       if(k==s) 
       System.out.println(s+ " it is amstrong no");
       else
       System.out.println(s+ " it is not amstrong no");
    }

}