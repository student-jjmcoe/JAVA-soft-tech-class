import java.util.*;
class ConvertRstoD
      {
         public static void main(String[]arg)
            {
               float rs,d;
               Scanner x = new Scanner(System.in);
               System.out.println("Enter a value:");
               rs = x.nextFloat();
               d = rs/86;
               System.out.println("Dollar="+d);
             }
       }