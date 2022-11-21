import java.util.Scanner;
class patten{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
    //    1. for(int i=1;i<=n;i++)//2<=5
    //     {
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }


     // 2  for(int i=n;i<=1;i--)//2<=5
    // {
    //     for(int j=1;j<=i;j++)//
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //  3.int x=0;
    //  for(int i=n;i>=1;i--)//2<=5
    // {
    //     for(int s=1;s<x;s++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     x++;
    // }


//    4. for(int i=1;i<=n;i++)//2<=5
//         {
//             for(int j=1;j<=n;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }


  //           for(int i=0;i<n;i++)
  //            {
  //              for(int j=0;j<n;j++)
  //           {
  //             System.out.print(i+","+j+" ");
  //       }
  //     System.out.println();
  // }


                //  6.   for(int i=1;i<=n;i++)//2<=5
                //     {
                //         for(int j=1;j<=i;j++)
                //         {
                //             System.out.print(j);
                //         }
                //         System.out.println();
                //     }


            //   7.  for(int i=n;i>=1;i--)//2<=5
            //         {
            //             for(int j=1;j<=i;j++)
            //             {
            //                 System.out.print(j);
            //             }
            //             System.out.println();
            //         }


                int x=1;
                    for(int i=n;i>=1;i--)//2<=5
                     {
                         for(int s=1;s<=n-i;s++)//s<x 
                         {
                             System.out.print(" ");
                         }
                         for(int j=1;j<=i;j++)
                         {
                             System.out.print("* ");
                         }
                         System.out.println();
                        //x++;
                     }



                    // for(int i=n;i>=1;i--)//2<=5
                    // {
                    //     for(int s=1;s<=n-i;s++)//1<=5-5
                    //     {
                    //         System.out.print(" ");
                    //     }
                    //     for(int j=1;j<=i;j++)
                    //     {
                    //         System.out.print(j+" ");
                    //     }
                    //     System.out.println();
                    //    // x++;
                    // }


                    
                    // for(int i=1;i<=n;i++)//2<=5
                    // {
                    //     for(int s=1;s<=n-i;s++)//1<=5-5
                    //     {
                    //         System.out.print(" ");
                    //     }
                    //     for(int j=1;j<=i;j++)
                    //     {
                    //         System.out.print(j+" ");
                    //     }
                    //     System.out.println();
                    //    // x++;
                    // }
    }
}