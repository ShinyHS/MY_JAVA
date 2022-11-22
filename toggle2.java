class toggle2{
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("heLlo wOrlLd SHiny");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=64 && s.charAt(i)<=90)
            {
                int t=s.charAt(i)+32;
                s.setCharAt(i,(char)t);
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122)
            {
                int t=s.charAt(i)-32;
                s.setCharAt(i,(char)t);
            }
        }
        System.out.println(s);
    }
}