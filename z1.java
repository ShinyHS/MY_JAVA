import java.util.Scanner;
class Z1
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        char ch=5;
        System.out.println("1.Movies\n2.Rises\n3.Fruits\n4.vegetables");
        System.out.println("enter the press button" +ch);
        int button=s.nextInt();
        if(button==1)
        {
            System.out.println("   MOVIES  ");
            System.out.println("   NANEA VARUVEAN ");
            System.out.println("   VIRUMAN  ");
            System.out.println("   PONNIN SELVAN ");
            System.out.println("   NAAYGAL JAKRADHAI 2 ");

        }
        if(button==2)
        {
            System.out.println("    RISES   ");
            System.out.println("   CURD RISE");
            System.out.println("  TOMATTO RISE");
            System.out.println("  BRINJI RISES ");
            System.out.println("   WHITE RISES");
        }
        if(button==3)
        {
            System.out.println("     FRUITS  ");
            System.out.println("    APPLES   ");
            System.out.println("     ORAGNES ");
            System.out.println("    MANGOS   ");
            System.out.println("     BANANAS  ");
            System.out.println("    GOBAS");
        }
        if(button==4)
        {
            System.out.println("   VEGETABLES ");
            System.out.println("  CARAT  ");
            System.out.println("  ONLINE ONIiON  ");
            System.out.println("  PITROOT  ");
            System.out.println("    MARUTHANI ");
            System.out.println("   DRY VENDAIKKAI ");
            
        }
    }
}