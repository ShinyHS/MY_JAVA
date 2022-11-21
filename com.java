import java.util.Scanner;
class com{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String x1="hello";
        String x2="hello";
		x2=x2.substring(0,1)+'e'+x2.substring(2);
		System.out.println(x2);
		if(x1==x2)
			System.out.println("true");
		else
			System.out.println("false");
    }
}