import java.util.Scanner;
class string{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
			//System.out.println(str);
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			System.out.println(str.charAt(i));
		}
	
	
	}
	
}