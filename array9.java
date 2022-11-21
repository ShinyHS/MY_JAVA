import java.util.Scanner;
class array9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a lenth");
        int n=sc.nextInt();
        int i;
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        //----big------------
        int b=arr[0];//1,2,3,4,5
        for(i=1;i<n;i++)
        {
            if(b<arr[i])
            {
                b=arr[i];
            }
        }
        System.out.println("Big :"+b);
        //-----small-------------
        b=arr[0];//1,2,3,4,5
        for(i=1;i<n;i++)
        {
            if(b>arr[i])
            {
                b=arr[i];
            }
        }
        System.out.println("Small :"+b);
    }
}