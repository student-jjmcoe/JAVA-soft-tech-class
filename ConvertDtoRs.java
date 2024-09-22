import java.util.*;
class ConvertDtoRs
     {
         public static void main(String[]arg)
             {
                float d,rs;
                Scanner x = new Scanner(System.in);
                System.out.println("Enter a Value:");
                d = x.nextFloat();
                rs = d*86;
                System.out.println("Rupees="+rs);
             } 
      }