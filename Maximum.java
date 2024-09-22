import java.util.*;
class Maximum
   {
      public static void main(String[]arg)
         {
             int a,b;
             Scanner x = new Scanner(System.in);
             System.out.println("Enter two numbers");
             a = x.nextInt();
             b = x.nextInt();

             if(a>=b)
               System.out.println("a is maximum");
             else
               System.out.println("b is maximum");
          }
     }