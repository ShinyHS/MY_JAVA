import java.util.Scanner;
class pol{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
			//System.out.println(str);
		int l=str.length();
		
		String x="";
		for(int i=l-1;i>=0;i--)
		{
			char t=str.charAt(i);
			x=x+t;
		}
		 if(x.equals(str))
		 {
			  System.out.println("polindrome");
		 }
		 else
		 {
			  System.out.println("not polindrome");
		 }
		 //String x1="hii";
		 //String x2="hii";
		 //if(x1==x2)
		//System.out.println(x.length());
			//System.out.println(str);

		 //System.out.println(str);
	
	}
	
}