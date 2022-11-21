import java.util.Scanner;
class vow{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
			//System.out.println(str);
		int l=str.length();
		int s=0;
		for( int i=0;i<l;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				s++;
				System.out.println(str.charAt(i));
			}
			
		}
		System.out.println("count: "+s);
	
	} 
	
}