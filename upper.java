class upper{
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("VenkAtesh");
        StringBuffer s1=new StringBuffer("");

        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)>=97 && s.charAt(i)<=122)
        //     {
        //         int t=s.charAt(i)-32;
        //         s1.append((char)t);
        //     }
        //     else
        //     {
        //         s1.append(s.charAt(i));
        //     }    
        // }
        //System.out.println(s1);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=97 && s.charAt(i)<=122)
            {
                int t=s.charAt(i)-32;
                s.setCharAt(i,(char)t);
            }
        }
        System.out.println(s);
    }
}