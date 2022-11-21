import java.util.Scanner;
class three {
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter four number");
		 a= sc.nextInt();
		 b= sc.nextInt();
		 c= sc.nextInt();

		if(a>b) 
		{
			if(a>c)
			{
				System.out.println(a+"is big");
			}
			else
			{
				System.out.println(c+"is big");
			}
			
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+"is big");
			}
			else
			{
				System.out.println(c+"is big");
			}
		}
		

	}
}