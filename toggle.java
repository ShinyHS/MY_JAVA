class toggle{
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("heLlo wOrlLd SHiny");
        s.insert(0," ");
        //System.out.println(s);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==32)
            {
              i++;
              if(s.charAt(i)>=65 && s.charAt(i)<=90)
              {
                int t=s.charAt(i)+32;
                s.setCharAt(i,(char)t); 
              }
            }  
            else
              if(s.charAt(i)>=97 && s.charAt(i)<=122)
              {
                int t=s.charAt(i)-32;
                s.setCharAt(i,(char)t); 
              }
        }
        System.out.println(s);
    }
}