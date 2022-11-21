import java.util.Scanner;
class nested {
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("enter four number");
		 a= sc.nextInt();
		 b= sc.nextInt();
		 c= sc.nextInt();//20/3/90//100 1 1 1 
		 d= sc.nextInt();
		 if(a>b)//100 30 400 43
		 {
			 if(a>c)//20>40
			 {
				 if(a>d)
				 {
					 System.out.println(a+"is greater");
				 }
				 else
				 {
					 System.out.println(d+"is greater");
				 }
			 }
			 else//c big
			 {
				 if(c>d)
				 {
					 System.out.println(a+"is greater");
				 }
				 else
				 {
					 System.out.println(d+"is greater");
				 }
			 }
		 }
		 else
		 {
			 if(b>c) 
			 {
				 if(b>d)
				 {
					 System.out.println(b+"is greater");
				 }
				 else
				 {
					  System.out.println(d+"is greater");
				 }
			 }
			 else
			 {
				if(c>d)
				 {
					 System.out.println(c+"is greater");
				 }
				 else
				 {
					  System.out.println(d+"is greater");
				 }
				 
			 }
			 
		 }
		 
	}
}