import java.util.*;
class ConvertRstoE
   {
        public static void main(String[]arg)
           {
              float rs,e;
              Scanner x = new Scanner(System.in);
              System.out.println("Enter a value:");
              rs = x.nextFloat();
              e = rs/96;
              System.out.println("Rupees="+e);
           }
   }