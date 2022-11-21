class Arithmatic{
public static void main(String args[])
{
	int x=10;
	int y=90;
	int a,b,c,d,e;
	 boolean x1;
	a=x+y;
	b=x-y;
	c=x*y;
	d=x/y;
	e=x%y;
	x1=a<b;//false
	System.out.println("add "+a);
	System.out.println("sub "+b);
	System.out.println("mul "+c);
	System.out.println("div "+d);
	System.out.println("mod "+e);
	System.out.println(a<b);
	System.out.println(a>b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a==b);
	System.out.println(a!=b);
	System.out.println(x1);
	
	x=100;
	System.out.println(x+=100);
	System.out.println(x-=100);
	System.out.println(x*=100);
	System.out.println(x/=100);
	System.out.println(x%=100);
	x++;
System.out.println(x);

	System.out.println(x<y && x>y);
	System.out.println(x<y || x>y);
	System.out.println(x!=y);
	
}
}