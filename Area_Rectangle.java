import java.util.*;
class Area_Rectangle
        {
          public static void main(String[]arg)
              {
                   float a,l,b;
                   Scanner x = new Scanner(System.in);
                   System.out.println("Enter two numbers:");

                   l=x.nextFloat();
                   b=x.nextFloat();
                   a=l*b;
                   System.out.println("Area of rectangle="+a);

              }
          }