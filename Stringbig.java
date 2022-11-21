class A1{
    public static void main(String[] args) {
        String str="venkatesh";
        //american standad value
        // int a=str.charAt(4);
        // System.out.println(a);


        //  for(int i=0;i<str.length();i++)
        //  {
        //     int a=str.charAt(i);
        //     System.out.println(a);
        //  }
        //  if('a'<'b')//97>98
        //  {
        //     System.out.println("yes");
        //  }
         //small >
        char b=str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            if(b>str.charAt(i))
            {
                b=str.charAt(i);
            }
        }
        System.out.println(b);
        

        //big <

        b=str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            if(b<str.charAt(i))
            {
                b=str.charAt(i);
            }
        }
        System.out.println(b);

        String x1="1234";
        System.out.println(x1.charAt(1)-48);

        if(x1.charAt(1)-48==2)
        System.out.println("yes");
    }
}