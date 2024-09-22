import java.util.*;
class MaxMin_2d
    {
        public static void main(String[]arg)
           {
              int max, min;
              int[][] a = new int[3][2];
              Scanner x = new Scanner(System.in);

              System.out.println("Enter Elements of array:");
              for(int i=0;i<3;i++)
              {
                  for(int j=0;j<2;j++)
                  {
                     a[i][j] = x.nextInt();
                  }
              }
              max = a[0][0];
              min = a[0][0];
              for(int i=0;i<3;i++)
              {
                  for(int j=0;j<2;j++)
                  {
                      if(max<a[i][j])
                         max = a[i][j];
                      if(min>a[i][j])
                         min = a[i][j];
                  }
              }
              System.out.println("Maximum="+max);
              System.out.println("Minimum="+min);
           }
    }