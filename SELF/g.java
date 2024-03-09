public class g {
                                                          // hollow reatange
// *****
// *   *
// *   *
// *   *
// *****
    // static void hollow(int n)
    // {
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=1;j<=n;j++)
    //         {
    //             if(i==1||j==1||i==n||j==n)
    //             {
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }

    //         }
    //         System.out.println();
    //     }
    // }
                                                 //inverted and rotated half piramid
//     *
//    **
//   ***
//  ****
// *****

    // static void hpiramid(int n)
    // {
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=1;j<=n-i;j++)
    //         {
    //          System.out.print(" ");   
    //         }
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //        System.out.println();
    //     }
    // }
                                           // inverted half piramid with number

// 12345
// 1234
// 123
// 12
// 1
    
    // public static void ihnumber(int n)
    // {
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=1;j<n-i+2;j++)
    //         {
    //            System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }
                                               // floyld trangel

// 1
// 23
// 456
// 78910
// 1112131415
    // static void numbert(int n)
    // {
    //     int count=1;
    //     for(int i=0;i<=n;i++)
    //     {
    //         for(int j=0;j<i;j++)
    //         {
    //             System.out.print(count++);
    //         }
    //         System.out.println();
    //     }
    // }
                                                        //o-1 trangle
// 1
// 01
// 101
// 0101
// 10101
//      static void binarytrangle(int n)
//      {
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 if((i+j)%2==0)
//                 {
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }

//             }
//             System.out.println();
//         }
//      }
                                                //butterfly patten
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
    // public static void butterfly(int n)
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         for(int j=0;j<2*(n-i-1);j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for(int i=n-1;i>=0;i--)
    //     {
    //         for(int j=0;j<i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         for(int j=0;j<2*(n-i-1);j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
                                            // solid rombus

//      *****
//     *****
//    *****
//   *****
//  *****
//     public static void solidrombus(int n)
//     {
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n-i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=0;j<n;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
                                       //hollow rombus
//      ******
//     *    *
//    *    *
//   *    *
//  *    *
// ******
//     public static void hollowrompus(int n)
//     {
//         for(int i=1;i<=n;i++)
//         {
//             for(int k=1;k<n-i;k++)
//             {
//                 System.out.print(" ");
//                 }
//             for(int j=1;j<=n;j++)
//             {
//                 if(i==1||j==1||j==n||i==n)
//                 {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//                                                //dimand pattern
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *
// public static void dimand(int n)
// {
//     for(int i=1;i<=n;i++)
// {
//     for(int j=1;j<=n-i;j++)
//     {
//         System.out.print(" ");
//     }
//     for(int j=1;j<=2*i-1;j++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i=n;i>=1;i--)
// {
//     for(int j=1;j<=n-i;j++)
//     {
//         System.out.print(" ");
//     }
//     for(int j=1;j<=2*i-1;j++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }
// }
    public static void main(String[] args)
    {
//    hollow(5);
// hpiramid(5);
// ihnumber(5);
// numbert(5);
// binarytrangle(5);
// butterfly(5);
// solidrombus(5);
// hollowrompus(6);
// dimand(5);
    }
}
