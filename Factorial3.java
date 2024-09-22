import java.util.*;
class Factorial3
   {
        public static void main(String[]arg)
          {
              int n;
              int fact=1;

              Scanner x = new Scanner(System.in);
              System.out.println("Enter value of n:");
              n = x.nextInt();

              for(int i=n;i>=1;i--)
              {
                  fact = fact*i;
              }
              System.out.println("Factorial="+fact);
          }
    }