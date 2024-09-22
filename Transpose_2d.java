import java.util.*;
class Transpose_2d
    {
         public static void main(String[]arg)
             {
                 int[][] a = new int[3][3];
                 Scanner x = new Scanner(System.in);
                 System.out.println("Enter Elements of array");
                 for(int i=0;i<3;i++)
                 {
                    for(int j=0;j<3;j++)
                    {
                        a[i][j] = x.nextInt();
                    }
                    System.out.println( );
                 }
                 System.out.println("Transpose of Array:");
                 for(int i=0;i<3;i++)
                 {
                    for(int j=0;j<3;j++)
                    {
                        System.out.println(a[j][i]);
                    }
                    System.out.println( );
                 }
              }
    }