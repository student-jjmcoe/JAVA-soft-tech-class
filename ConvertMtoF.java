import java.util.*;
class ConvertMtoF
      {
          public static void main(String[]arg)
               {
                   double m,f;
                   Scanner x = new Scanner(System.in);
                   System.out.println("Enter a value:");
                   m = x.nextDouble();
                   f = (m)/3.2;
                   System.out.println("Feet="+f);
                }
       }