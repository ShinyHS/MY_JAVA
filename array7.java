import java.util.Scanner;
class array7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a lenth");
        int n=sc.nextInt();
        int pol=0,i;
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int p=arr[i];
            pol=0;
            while(p!=0)
            {
                int t=p%10;
                pol=pol*10+t;
                p=p/10;
            }
            if(arr[i]==pol)
            System.out.println(arr[i]+" is polindrome");
            else
            System.out.println(arr[i]+" is not polindrome");
        }

        

    }
}