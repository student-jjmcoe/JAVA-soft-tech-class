import java.util.*;
class ConvertEtoRs
   {
        public static void main(String[]arg)
           {
              float rs,e;
              Scanner x = new Scanner(System.in);
              System.out.println("Enter a value:");
              e = x.nextFloat();
              rs = e*96;
              System.out.println("Rupees="+rs);
           }
   } 