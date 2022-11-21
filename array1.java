import java.util.Scanner;
class array1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

		System.out.println("enter a length");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();

		System.out.println("__________________");
		for(int i=n-1;i>=0;i--)
		System.out.println(arr[i]);	
		  
    }
}