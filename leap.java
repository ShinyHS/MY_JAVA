import java.util.Scanner;
class leap {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int year =sc.nextInt();
		 if(year%4==0)
		 {
			if(year %100==0)
			{
				if(year%400==0)
				{
					 System.out.println("leap year");
				}
				else{
					 System.out.println("not leap year");
				}
			}	
			else //4**2 => 16 **0.5
			
				 System.out.println("leap year");	
		 }
		 else
		 {
			 System.out.println("not leap year");
		 }
 
	}
	
}