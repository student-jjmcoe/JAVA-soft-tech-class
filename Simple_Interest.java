import java.util.*;
class Simple_Interest
    {
       public static void main(String[]arg)
          {
             double s,p,n,r;
             Scanner x = new Scanner(System.in);
             System.out.println("Enter two numbers:");
             p = x.nextDouble();
             n = x.nextDouble();
             r = x.nextDouble();
             s=(p*n*r)/100;
             System.out.println("Simple interest is="+s);
          }
     }