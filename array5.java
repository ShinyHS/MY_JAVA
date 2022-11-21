import java.util.Scanner;
class array5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a lenth");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] odd=new int[n];//doubt 
        int[] even=new int[n];
        int x=0,y=0;
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even[x]=arr[i];
                x++;
            }
            else
            {
                odd[y]=arr[i];
                y++;
            }
        }
        System.out.println("odd number");
        for(int i=0;i<odd.length;i++)
        System.out.println(odd[i]);
        System.out.println("even number");
        for(int i=0;i<even.length;i++)
        System.out.println(even[i]);
    }
}