import java.util.*;
class Factorial2
   {
       public static void main(String[]arg)
          {
             int n;
             int fact=1;
             Scanner x = new Scanner(System.in);
             System.out.println("Enter value of n:");
             n = x.nextInt();

             do
             {
                fact=fact*n;
                n--;
             }while(n>=1);
             System.out.println("Factorial="+fact);
          }
    }