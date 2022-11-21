import java.util.Scanner;
class array10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a lenth");
        int n=sc.nextInt();
        int i;
        String x="";
        String arr[]=new String[n];
        for(i=0;i<n;i++)
        arr[i]=sc.next();

        for(i=0;i<n;i++)
        {
            String a=arr[i];
            x="";
            for(int j=a.length()-1;j>=0;j--)
            {
                x=x+a.charAt(j);
            }
            // System.out.println(x+" ____________");
            if(x.equals(arr[i]))
            System.out.println(arr[i]+" is polindrome");
            else
            System.out.println(arr[i]+" is not polindrome");
        } 
    }
}