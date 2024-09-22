import java.util.*;
class JaggedArray
    {
        public static void main(String[]arg)
           {
              int[][] a =new int[3][];
              Scanner x=new Scanner(System.in);

              System.out.println("Enter Elements of Array");
              a[0] = new int[2];
              a[1] = new int[3];
              a[2] = new int[2];

              for(int i=0;i<2;i++)
                 a[0][i] = x.nextInt();
              System.out.println( );

              for(int i=0;i<3;i++)
                 a[1][i] = x.nextInt();
              System.out.println( );

              for(int i=0;i<2;i++)
                 a[2][i] = x.nextInt();
 
              System.out.println("Array is:");
              for(int i=0;i<3;i++)
              {
                  for(int j=0;j<a[i].length;j++)
                  {
                      System.out.println(a[i][j]);
                  }
                  System.out.println( );
              }
           }
    }