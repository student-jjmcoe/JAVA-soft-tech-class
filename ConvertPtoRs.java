import java.util.*;
class ConvertPtoRs
      {
         public static void main(String[]arg)
            {
                float rs,p;
                Scanner x = new Scanner(System.in);
                System.out.println("Enter a value:");
                p = x.nextFloat();
                rs = p*100;
                System.out.println("Rupees="+rs);
            }
       }