import java.util.Scanner;
class s4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine(); //hello world => olleh dlrow  dlrow o hello 012345//str=
		
		
        String x="";
        str=str+' ';//hello world+' ' hello world 
        int l=str.length();
        for(int i=0;i<l;i++)//6
        {
            if(str.charAt(i)==' ') //charAt(5)==' ' ' '==' '
            {
                
                int xl=x.length(); //x=hello xl=5
               for(int j=xl-1;j>=0;j--)
                System.out.print(x.charAt(j));//olleh    
                System.out.print("    ");
                x="";//x=hell0 x="";
            }
            else
            {
                char t=str.charAt(i);//t=o;
                x=x+t;//x=""+w; x=w x=w+o x=world 
            }
			
        }
    }
}