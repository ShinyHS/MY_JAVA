import java.util.Scanner;
class s3{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine(); //hi my name venkatesh => hmnv //hi is
        int l=str.length();
        System.out.print(str.charAt(0)+" ");//h
        for(int i=0;i<l;i++){
            if(str.charAt(i)==' ')
            System.out.print(str.charAt(i+1)+" ");//is
        }   
    }
}