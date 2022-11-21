import java.util.Scanner;
class array6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a lenth");
        int n=sc.nextInt();
        int flag=0,i;
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();

        for(i=0;i<n;i++)
        {
            int p=arr[i];
            flag=0;
            for(int j=1;j<=p;j++)
            {
                if(p%j==0)
                {
                    flag++;
                }
            }
            if(flag<=2)
            System.out.println(p+" is prime");
            else
            System.out.println(p+" is not prime");
        }

        

    }
}