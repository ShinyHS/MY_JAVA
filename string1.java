import java.util.Scanner;
class string1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // String s1="venkatesh";
        // String s2="Shiny";
        // s1=s1+" "+s2; 
        // System.out.println(s1);
        //String s1=s.nextLine();
        // System.out.println(s1);
        //int l=s1.length(),i;
       // String x="";
        // for(int i=0;i<l;i++){
        //     if(i%2==0)
        //     {
        //         x=x+s1.charAt(i);
        //         //System.out.println(s1.charAt(i));
        //     }
        // }
        
        // int count=0;
        // for(i=0;i<l;i++)
        // {
        //     if(s1.charAt(i)=='!'||s1.charAt(i)=='@'||s1.charAt(i)=='#')
        //     count++;
        // }
       
        // System.out.println(count);
        
        //asending string
        // int j;
        // for(i=0;i<l;i++)
        // {
        //     for(j=i-1;j<l;j++)
        //     {
        //         if(s1.charAt(i)>s1.charAt(j))
        //         {
        //             char x1= s1.charAt(i);
        //             s1.charAt(i)=s1.charAt(j);
        //             s1.setCharAt(j,x1);
        //         }
        //     }
        // }
        // System.out.println(s1);
         
        String myname="venkatesh";
        int l=9;
       char[] m=myname.toCharArray();
        //char my=mynamechars[3];
        // System.out.println(m[5]);
for(int i=0;i<l;i++)
System.out.println(m[i]);

    //    asending string
        int j,i;
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(m[i]>m[j])
                {
                    char x1= m[i];
                    m[i]=m[j];
                    m[j]=x1;
                }
            }
        }
        System.out.println("--------------------------");
        for(i=0;i<l;i++)
        System.out.println(m[i]);
        System.out.println("--------------------------");
        //for(i=0;i<l;i++)
        System.out.println(m);  

        char[] a="venkatesh".toCharArray();
        System.out.println("yess" +a[3]);
    }
}