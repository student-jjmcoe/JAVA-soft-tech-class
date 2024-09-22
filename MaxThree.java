import java.util.*;
class MaxThree
    {
       public static void main(String[]arg)
          {
              int a,b,c;
              Scanner x = new Scanner(System.in);
              System.out.println("Enter three numbers");
              
              a = x.nextInt();
              b = x.nextInt();
              c = x.nextInt();

              if(a>b && a>c)
                  System.out.println("a is maximum");
              else
                  if(b>a && b>c)
                    System.out.println("b is maximum");
                  else
                    System.out.println("c is maximum");
           }
     }