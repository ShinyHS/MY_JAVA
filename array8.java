import java.util.Scanner;
class array8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a lenth");
        int n=sc.nextInt();
        int ams=0,i;
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int p=arr[i];
            ams=0;
            while(p!=0)
            {
                int t=p%10;
                ams=ams+t*t*t;
                p=p/10;
            }
            if(arr[i]==ams)
            System.out.println(arr[i]+" is amstrong");
            else
            System.out.println(arr[i]+" is not amstrong");
        }
    }
}