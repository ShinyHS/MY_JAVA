class typecast{
    public static void main(String[] args) {
        //wideing small to big => just assign 
        // norrowing big to small => use (int or any ) function;
        /*
         byte 1
         short 2
         int 4
         long 8
         float 4
         double 8
         boolean 1 bit
         char 2
         */
        int a=65;
        double b=a;
        char c=(char)a; 
        long d=a;
        char x='~';
        int x1=x;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(x1);
    }
}