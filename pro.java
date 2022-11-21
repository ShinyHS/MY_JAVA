class pro{
    public static void main(String[] args) {
        String str="malayalam";
        char[] x=str.toCharArray();//['m','a','l','a','y','a','l','a','m']
        int l=str.length(),i,b=70;
        char p=' ';
        int count=1;
        for(i=0;i<l;i++)
        {
            count=1;
            for(int j=i+1;j<l;j++)
            {
                if(x[i]==x[j])
                {
                    count++;
                }
            }
            if(b>count)
            {
                b=count;
                p=x[i];
            }
        }
       System.out.println(p);
    }
}