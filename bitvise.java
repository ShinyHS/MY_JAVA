class bit{
    public static void main(String[] args) {
        int a=3,b=9;
        System.out.println("and "+(a&b));// 0011 1001 0 0 0 1   0101 8421                                   
        System.out.println("or "+(a|b));// 0011 1001 1 0 1 1  8+2+1 11
        System.out.println("X or "+(a^b));// 0011 1001 1 0 1 0  10
        System.out.println("X not "+(~a));//3+1 4*-1 -4
    }
}