import java.util.Scanner;
class loop
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int s=0;
	/*for(int i=0;<=10;i++)
	{
		System.out.println(i+"\n");
	}
	for(int i=10;i>=1;i--)
	{
		System.out.println(i+"\n");
	}*/
	/*for(int i=0;i<=n;i++)
	{
		System.out.println(i+"\n");
	}*/
	/*for(int i=n;i>=1;i--)
	{
		System.out.println(i+"\n");
	}*/
	 
	 for(int i=1;i<=n;i++)
	 {
		 System.out.println(n +"*" +i+"="+n*i);
	 }
	/* for(int i=1;i<=n;i++)
	{
		 s=s*i;
	}
	System.out.println(s);
	*/
	/*int i=1;
	 while(i<=n)
	 {
		 System.out.println(n +"*" +i+"="+n*i);
		i++;
		}*/
	
	
	int x=n*n;
	int r=0;
	
	while(x!=0)
	{
		r=x%10;
		s=s+r;
		x=x/10;
	}
	if(n==s)
		System.out.println("neon");
	else
		System.out.println(" not neon");
	/*char y='a';
	for(char i='a';i<='z';i++)
	{
		System.out.println(i);
	}*/
	
}


}