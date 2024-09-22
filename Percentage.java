import java.util.*;
class Percentage
    {
        public static void main(String[]arg)
            {
               float a,b,c,t,p;
               Scanner x = new Scanner(System.in);
               System.out.println("Enter three numbers:");
               a = x.nextFloat();
               b = x.nextFloat();
               c = x.nextFloat();
               t = a+b+c;
               p = t/3;
               System.out.println("Total is="+t);
               System.out.println("Percentage is="+p);
            }
      }