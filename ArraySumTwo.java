import java.util.*;
class ArraySumTwo
   {
        public static void main(String[]arg)
           {
               int[]a = new int[4];
               int[]b = new int[4];
               int[]c = new int[4];
               Scanner x = new Scanner(System.in);

               System.out.println("Enter Elements of Array a");
               for(int i=0;i<4;i++)
                  a[i] = x.nextInt();

               System.out.println("Enter Elements of Array b");
               for(int i=0;i<4;i++)
                  b[i] = x.nextInt();

               for(int i=0;i<4;i++)
                  c[i] = a[i]+b[i];

               System.out.println("Addition of Two Array is");
               for(int i=0;i<4;i++)
                  System.out.println(c[i]);
           }
    }
              

