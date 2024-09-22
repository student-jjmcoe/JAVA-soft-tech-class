import java.util.*;
class Factorial1
    {
        public static void main(String[]arg)
            {
                 int n;
                 int fact=1;
                 Scanner x = new Scanner(System.in);
                 System.out.println("Enter value of n:");
                 n = x.nextInt();

                 while(n>=1)
                 {
                    fact=fact*n;
                    n--;
                 }
                 System.out.println("Factorial="+fact);
             }
      }