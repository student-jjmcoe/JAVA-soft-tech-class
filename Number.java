import java.util.*;
class Number 
    {
         public static void main(String[]arg)
            {
                 int n;
                 Scanner x = new Scanner(System.in);
                 System.out.println("Enter a number:");
                 n = x.nextInt();
                 
                 if(n>=0)
                   System.out.println("Number is positive");
                 else
                   System.out.println("Number is negative");
            }
     }