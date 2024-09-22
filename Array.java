import java.util.*;
class Array
   {
        public static void main(String[]arg)
            {
                  int[]a = new int[4];
                  Scanner x = new Scanner(System.in);
                  System.out.println("Enter Array elements:");
                  for(int i=0;i<4;i++)
                     a[i]=x.nextInt();

                  System.out.println("Elements of array:");
                  for(int i=0;i<4;i++)
                     System.out.println(a[i]);
             }
     }