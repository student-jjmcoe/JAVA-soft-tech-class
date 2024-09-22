import java.util.*;
class TwoD_Array
  {
         public static void main(String[]arg)
            {
                 int[][] a = new int[3][3];
                 Scanner x = new Scanner(System.in);

                 System.out.println("Enter Elements of Array");
                 for(int i=0;i<3;i++)
                 {
                     for(int j=0;j<3;j++)
                        {
                            a[i][j]=x.nextInt();
                        }
                 }
                 System.out.println("Array is:");
                 for(int i=0;i<3;i++)
                 {
                    for(int j=0;j<3;j++)
                        {
                             System.out.println(a[i][j]);
                        }
                 }
           }
    }