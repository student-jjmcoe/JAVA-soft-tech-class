import java.util.*;
class Search_2d
   {
      public static void main(String[]arg)
         {
             int num;
             int flag=0;
             int[][] a = new int[3][2];
             Scanner x = new Scanner(System.in);
             System.out.println("Enter Number to search");
             num = x.nextInt();
 
             System.out.println("Enter Elements of Array:");
             for(int i=0;i<3;i++)
             {
                 for(int j=0;j<2;j++)
                   {
                       a[i][j] = x.nextInt();
                   }
             }
             for(int i=0;i<3;i++)
             {
                for(int j=0;j<2;j++)
                {
                   if(a[i][j]==num)
                   {
                      flag=1;
                      break;
                   }
                }
             }
             if(flag==1)
                System.out.println("Element found");
             else
                System.out.println("Element not found");
         }
    }