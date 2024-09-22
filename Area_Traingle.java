import java.util.*;
class Area_Traingle
      {
           public static void main(String[]arg)
               {
                    double a,b,h;
                    Scanner x = new Scanner(System.in);
                    System.out.println("Enter Two Number:");
                    b = x.nextDouble();
                    h = x.nextDouble();
                    a = 0.5*b*h;
                    System.out.println("Area of Traingle="+a);
                }
        }