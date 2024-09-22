import java.util.*;
class Additionfloat
          {
              public static void main(String[]arg)
                    { 
                         float a,b,c;
                         Scanner x = new Scanner(System.in);
                         System.out.println("Enter two numbers:");
              
                         a = x.nextFloat();
                         b = x.nextFloat();
                         c = a+b;
 
                         System.out.println("Addition is ="+c);
                    }
           }