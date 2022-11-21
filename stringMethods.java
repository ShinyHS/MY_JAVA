class methods{
    public static void main(String[] args) {
        String a="venkatesh";
        String b="VenKatEsh";
        char[] c={'h','e','l','l','o'};
        String x="    he";
        System.out.println(a.charAt(5));//5 inded =>t
        System.out.println(a.codePointAt(0));// ascii value of 0
        System.out.println(a.codePointBefore(1));// ascii value of berore value ex 1 =>e before v=>118
        System.out.println(a.codePointCount(0,4));// count ascii value 0 to 4 =>  0 1 2 3
        System.out.println(a.compareTo(b));// if 0 equal  not ignore case
        System.out.println(a.compareToIgnoreCase(b));// if 0 equal  ignore case
        System.out.println(a.concat("  shiny"));//join to string
        System.out.println(a.contains("katesh"));//search in string
        System.out.println(a.contentEquals("venkatesh"));// check equal given string value is equal
        System.out.println(x.copyValueOf(c,0,5));//  copy the array into the string {'h','e'} => s="he"; start value is 0
        System.out.println(a.endsWith("esh"));// end with esh => true s=> false
        System.out.println(a.startsWith("esh"));// start with ven => true s=> false
        System.out.println(a.equals(b));// equal check
        System.out.println(a.equalsIgnoreCase(b));// equal check ignore case
        System.out.println(a.hashCode());// gives memory addres
        System.out.println(b.hashCode());// gives memory addres
        System.out.println(a.indexOf('v'));//return index no
        System.out.println(x.isEmpty());//string is empty retun true
        System.out.println(a.lastIndexOf('e'));//return last index of e
        System.out.println(a.lastIndexOf('e'));//return last index of e
        System.out.println(a.length());//return last index of e
        System.out.println(a.replace('v','H'));//replace the character
        System.out.println(a.toUpperCase());// change uppercase
        System.out.println(a.toLowerCase());// change lowercase
        System.out.println(x.trim());// remove white spaces
        

    }
}