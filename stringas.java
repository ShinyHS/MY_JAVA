class asnd{
    public static void main(String[] args) {
        String str="venkatesh";
        char[] st=str.toCharArray();
        //System.out.println(st[0]);
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(st[i]>st[j])
                {
                    char t=st[i];
                    st[i]=st[j];
                    st[j]=t;
                   // str.substring()=str.charAt(i);
                    //str.charAt(j)=str.charAt(i);
                    //str.charAt(i)=t;
                }
            }
        }
        System.out.println(st);


        //String s="venkatesh";
        
    
    }
}