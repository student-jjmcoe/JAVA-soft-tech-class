import java.util.*;
class Addition_2dArrays
    {
         public static void main(String[]arg)
            {
                int[][] a = new int[3][3];
                int[][] b = new int[3][3];
                int[][] c = new int[3][3];
                Scanner x = new Scanner(System.in);

                System.out.println("Enter Elements of Array a:");
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                       {
                           a[i][j]=x.nextInt();
                       }
                       System.out.println( );
                }

                System.out.println("Enter Elements of Array b:");
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                       {
                           b[i][j]=x.nextInt();
                       }
                       System.out.println( );
                }

                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                       {
                           c[i][j]=a[i][j]+b[i][j];
                       }
                      
                }

                System.out.println("Addition of Elements of Array:");
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                       {
                           System.out.println(c[i][j]);
                       }
                       System.out.println( );
                }
            }
  }

                
