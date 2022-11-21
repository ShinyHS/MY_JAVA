import java.util.Scanner;
class array2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

		System.out.println("enter a length");
		int n=s.nextInt();
		int arr[]=new int[n];
		//a[]=[1,2,3,4]
		int sum=0;
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();

		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		 System.out.println("sum: "+sum);
		  
    }
}