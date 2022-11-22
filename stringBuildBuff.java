class stringBuildBuff{
    public static void main(String[] args) {
        StringBuffer a= new StringBuffer("venkatesh");
        StringBuffer c=a.append(" shiny");//c=venkatesh shiny
        a.append(" shiny");//a=venkatesh shiny
        System.out.println(c);
        System.out.println(a);
        //a.charAt(0)='h';
        if(c==a)
        System.out.println(a);
        String x="venkatesh";
        //System.out.println(x.replace());//doubt
        a.setCharAt(0,'H');
        a.reverse();
        a.reverse();
        a.delete(0,5);
        a.replace(0,3,"hazel ");//0 to hazel start to 3
        StringBuffer v= new StringBuffer("hi");//start in 16 add evert value
        System.out.println(v.capacity());
        a.import(0,"hii");//doubt
        System.out.println(a);

    }
}