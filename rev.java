import java.util.Scanner;
class rev{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
			//System.out.println(str);
		int l=str.length();
		for(int i=l-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
	
	
	}
	
}