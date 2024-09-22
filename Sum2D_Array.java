import java.util.*;
class Sum2D_Array
     {
         public static void main(String[]arg)
            {
                 int sum=0;
                 int[][] a = new int[3][2];
                 Scanner x = new Scanner(System.in);

                 System.out.println("Enter elements of Array:");
                 for(int i=0;i<3;i++)
                 {
                     for(int j=0;j<2;j++)
                     {
                         a[i][j]=x.nextInt();
                     }
                     System.out.println( );
                 }
                 for(int i=0;i<3;i++)
                 {
                     for(int j=0;j<2;j++)
                     {
                         sum=sum+a[i][j];
                     }
                 }
                 System.out.println("Sum="+sum);
             }
      }
                     