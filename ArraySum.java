import java.util.*;
class ArraySum
    {
        public static void main(String[]arg)
          {
               int[]a = new int[4];
               Scanner x = new Scanner(System.in);
               int sum = 0;

               System.out.println("Enter Array Element:");
               for(int i=0;i<4;i++)
                  a[i] = x.nextInt();

               for(int i=0;i<4;i++)
                  sum=sum+a[i];

               System.out.println("Sum of array="+sum);
           }
      }
             