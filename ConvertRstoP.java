import java.util.*;
class ConvertRstoP
      {
         public static void main(String[]arg)
            {
                float rs,p;
                Scanner x = new Scanner(System.in);
                System.out.println("Enter a value:");
                rs = x.nextFloat();
                p = rs/100;
                System.out.println("Pound="+p);
            }
       }