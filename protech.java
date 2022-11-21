class pro{
    public static void main(String[] args) {
        String str="malayalam";
        char[] x=str.toCharArray();
        int l=str.length(),b=0,i;
        String y="";
        char p='A';
        int count=0;
        for(i=0;i<l;i++)
        {
           count=1;
            for(int j=i+1;j<l;j++)
            {
                if(x[i]==x[j])
                count++;
            }
            System.out.println(x[i]+"  "+count);
            if(b<count)
            {
    
                b=count;
                p=x[i];
            }
           
        }
        System.out.println("--------");
        System.out.println(p+" "+b);
    
    }
}