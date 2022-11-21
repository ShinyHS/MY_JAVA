import java.util.Scanner;
class s5{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine(); //hello world =>//h
        int l=str.length();
        String x="";
        for(int i=0;i<l;i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
              // str=str.replace(str.charAt(i),'@');
               str=str.substring(0,i)+'@'+str.substring(i+1);
               //System.out.println(str);
            }
            else{
               //str=str.replace(str.charAt(i),'#');


            //    System.out.println(str);
            }
        }
        // String x1=str.replace(str.charAt(0),'@');
        // System.out.println(x1);
         System.out.println(str);
        
    }
}